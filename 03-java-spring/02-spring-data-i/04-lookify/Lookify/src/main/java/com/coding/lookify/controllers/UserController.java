package com.coding.lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.lookify.models.Lookify;
import com.coding.lookify.models.Song;
import com.coding.lookify.services.LookifyService;
import com.coding.lookify.services.SongService;

@Controller
public class UserController {
	
	@Autowired
	private LookifyService lService;
	
	@Autowired
	private SongService sService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute ("search") Lookify l) {
		model.addAttribute("songs", sService.getAllSongs());
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute ("newSong") Song song) {
		
		return "add_song.jsp";
	}
	
	@PostMapping("/add/song")
	public String addSong(@Valid @ModelAttribute ("newSong") Song song, BindingResult result) {
//	sService.createSong(song);
//		return "redirect:/songs/new";
		if(result.hasErrors()) {
			return "add_song.jsp";
		}
		else{
			sService.createSong(song);
			return "redirect:/songs/new";
		}
		
	}
	
	@GetMapping("/songs/{id}")
	public String showASong(@PathVariable ("id") Long id, Model model) {
		Song songId = sService.songId(id);
		model.addAttribute("aSong", songId);
		return "details.jsp";
	}
	
	@PostMapping("/search/artists")
	public String searchArtists(@RequestParam ("name") String name) {
		this.lService.getAll();
//		lService.getOneArtist(id);
//		return "redirect:/search/{name}";
		return "redirect:/search/" + name;
	}
	
	@GetMapping("/search/{name}")	
	public String searchArtistName(@PathVariable ("name") String name, Model model) {
		model.addAttribute("songs", sService.artistWithSongs(name));
		model.addAttribute("Name", name);
		return "search.jsp";
	}
	
	@PostMapping("/search/songs")
	public String searchSong(@RequestParam ("name") String name) {
		return "redirect:/search/"+name;
		
	}
	
	@GetMapping("/search/topTen")
	public String searchTopTen(Model model) {
		model.addAttribute("topTen", sService.topTen());
		
		return "topTen.jsp";
	}
	
//	delete a song
	@DeleteMapping("/delete/{id}")
	public String deleteSong(@PathVariable ("id") Long id) {
		sService.deleteASong(id);
		return "redirect:/dashboard";
	}

}
