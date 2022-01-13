package com.coding.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.lookify.models.Song;
import com.coding.lookify.repositories.SongRepository;

@Service
public class SongService {
	@Autowired
	private SongRepository sRepo;
	
// get all songs
	public List<Song> getAllSongs(){
		return sRepo.findAll();
	}
	
//	create a song
	public Song createSong(Song song) {
		return sRepo.save(song);
	}
	
//	get a song by id 
	public Song songId(Long id) {
		return sRepo.findById(id).orElse(null);
	}
	
//	get top ten song list
	public List <Song> topTen() {
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	
//	get an artist with their songs
	public List<Song> artistWithSongs(String art){
		return sRepo.findByArtistContaining(art);
	}
	
//	delete a song
	public void deleteASong(Long id) {
		 sRepo.deleteById(id);
	}
	
	
}
