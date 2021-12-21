package com.coding.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;//user interface model
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.languages.models.Languages;
import com.coding.languages.services.LanguagesService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguagesService lService;
	
	
//	@GetMapping("/languages")
//	public String index( Model model) {
//		List<Languages> lang = this.lService.allLanguages();
//		model.addAttribute("languages", lang);
//		return "index.jsp";
//	}
//	@RequestMapping("/")
	@GetMapping("/languages")
	public String index(@ModelAttribute("language") Languages languages, Model model) {
		List<Languages> lang = this.lService.allLanguages();
		model.addAttribute("languages",lang);
		return "index.jsp";
	}
	
//	@RequestMapping(path="/languages" method=RequestMethod.POST)
	@PostMapping("/languages")
	public String languages(
			@RequestParam  (value="name") String nAme, 
			@RequestParam  (value="creator") String cReator,
			@RequestParam  (value="version") String vErsion, Model model) {
		model.addAttribute("name", nAme);
		model.addAttribute("creator", cReator);
		model.addAttribute("version", vErsion);
		return "index.jsp";
	}
	
//	create
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("language") Languages languages, BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}
		else {
			Languages language= lService.create(languages);
			return "redirect:/languages";
		}
	}
	
//  delete
	@DeleteMapping("/languages/{id}")
	public String delete(@PathVariable (value="id")Long id){
		 lService.delete(id);
		 return "redirect:/languages";
		 
	}
	
//  Edit
	@GetMapping("/edit/languages/{id}")
	public String Edit(@PathVariable (value="id")Long id, @ModelAttribute("editedLanguage") Languages language, Model model){
		Languages edit= lService.findOne(id);
		model.addAttribute("editL",edit);
		return "edit.jsp";
		 
	}
//	Update
	@PutMapping("/update/{id}")
	public String update(@PathVariable (value="id")Long id, Model model, @Valid @ModelAttribute("editedLanguage") Languages language, BindingResult results ){
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		else {
			Languages L = lService.update(id, language.getName(), language.getCreator(), language.getVersion());
			return "redirect:/languages";
		}
		 
	}
	
	@GetMapping("/show/languages/{id}")
	private String getOneId(@PathVariable (value="id") Long id, Model model) {
		Languages lang = this.lService.findOne(id);
		model.addAttribute("languages",lang);
		return "result.jsp";
	}
}
