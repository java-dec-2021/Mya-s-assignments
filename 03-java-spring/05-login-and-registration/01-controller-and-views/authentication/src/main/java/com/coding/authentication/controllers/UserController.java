package com.coding.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding.authentication.models.User;
import com.coding.authentication.services.UserService;
import com.coding.authentication.validators.UserValidator;

@Controller
public class UserController {
	@Autowired 
	private UserService userService;
	
	@Autowired 
	private UserValidator userValidator;
	
	@GetMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		model.addAttribute("user", u);
		return "homePage.jsp";
    }
	
	@GetMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
	
//	@RequestMapping(value="/registration", method=RequestMethod.POST)
	@PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		// if result has errors, return the registration page (don't worry about validations just now)
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}
		 // else, save the user in the database, save the user id in session, and redirect them to the /home route
		User  newUser = userService.registerUser(user);
		session.setAttribute("userId", newUser.getId());
		return "redirect:/home";
	}
	
	@GetMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
	
//	 @RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redir) {
		// if the user is authenticated, save their user id in session
//		boolean isAuthenticated = userService.authenticateUser(email, password);
//	    if(isAuthenticated) {
//	    	User u = userService.findByEmail(email);
//	    	session.setAttribute("userId", u.getId());
//	    	return "redirect:/home";
//	    }
//	    // else, add error messages and return the login page
//	    else {
//	    	redir.addFlashAttribute("error", "Invalid email/password");
//	    	return "redirect:/login";
//	    }
	
		// if the user is authenticated, save their user id in session
		if(userService.authenticateUser(email, password)) {
			User user = userService.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/home";
		}
	        // else, add error messages and return the login page
		redir.addFlashAttribute("error", "Invalid email/password");
		return "redirect:/login";
	    }
	
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        // invalidate session
		 session.invalidate();
	        // redirect to login page
		 return "redirect:/registration";
		 
	    }
}
