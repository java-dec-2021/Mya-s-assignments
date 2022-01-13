package com.coding.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.authentication.models.User;
import com.coding.authentication.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo;
	
//	register user and hash their password
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(),BCrypt.gensalt());
		user.setPassword(hashed);
		return uRepo.save(user);
	}
	
//	find user by email
	public User findByEmail(String email) {
		return uRepo.findByEmail(email);
	}
	
//	find user by id
	public User findUserById(Long id) {
		Optional<User> u = uRepo.findById(id);
		if (u.isPresent()) {
			return u.get();
		}
		else {
			return null;
		}
	}
	
//	authenticate user
	public boolean authenticateUser (String email, String password) {
//		first find the user by email
		User user = uRepo.findByEmail(email);
//		if we can't find user by email, return false
		if(user == null) {
			return false;
		}
		else {
//			if the passwords match, return true, else, return false
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
