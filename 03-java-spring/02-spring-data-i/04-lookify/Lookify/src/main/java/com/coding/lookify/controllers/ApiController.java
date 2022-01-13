package com.coding.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.lookify.models.Lookify;
import com.coding.lookify.models.Song;
import com.coding.lookify.services.LookifyService;
import com.coding.lookify.services.SongService;

@RestController
public class ApiController {
	@Autowired
	private LookifyService lService;
	
	@Autowired
	private SongService sService;

//	get all artists
	@GetMapping("/api")
	private	 List<Lookify> allArtists(){
		return this.lService.getAll();
	}
	
//	create a song
	@PostMapping("/create/song/api")
	private	 Song createASong(Song s){
		return sService.createSong(s);
	}
	
//	get all songs
	@GetMapping("/getAllSongs")
	private	 List<Song> allSongs(){
		return this.sService.getAllSongs();
	}
	
//	get a song 
	@GetMapping("/getASong/{id}")
	private Song getASong(@PathVariable ("id") Long id) {
		return sService.songId(id);
	}
	
//	get an artist/lookify
	@GetMapping("/getAnArtist/{id}") 
	private Lookify getAnArtist(@PathVariable ("id") Long id) {
		return lService.getOneArtist(id);
	}
	
//	get top ten song list
	@GetMapping("/TopTenSong/api")
	private List <Song> getTopTen(){
		return sService.topTen();
	}
	
//	get a specific artist with their songs
	@GetMapping("/artistWithSongs/api")
	private List<Song> artWithSongs(String name){
		return sService.artistWithSongs(name);
	}
	
//	delete a song
	@DeleteMapping("/deleteASong/{id}/api")
	private void delete(@PathVariable ("id") Long id) {
		sService.deleteASong(id);
	}
	
}
