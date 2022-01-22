package com.coding.dojoOverflow.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.dojoOverflow.models.Answer;
import com.coding.dojoOverflow.models.Question;
import com.coding.dojoOverflow.models.Tag;
import com.coding.dojoOverflow.services.OverFlowService;
import com.coding.dojoOverflow.validators.TagValidator;

@Controller
public class QuestionController {

	@Autowired
	private OverFlowService oService;
	
	@Autowired 
	private TagValidator validator;

	@GetMapping("/questions/new")
	public String newQuestion(@ModelAttribute ("new")Question q, Tag t) {
		
		return "new_question.jsp";
	}
	
	@GetMapping("/questions")
	public String question(@ModelAttribute ("new")Question q, Tag t, Model model) {
		model.addAttribute("allQuestions", oService.getAllQuestions());
		model.addAttribute("alltags", oService.getAllTags());
		return "dashboard.jsp";
	}
	
//	@PostMapping("/create/question")
//	public String createQuestion(@RequestParam ("createQuest") String question, @RequestParam ("createTag") String tag) {
////		validator.validate(quest, results);
////		if(results.hasErrors()) {
////			return "new_question.jsp";
////		}
////		else {
//		oService.createQuestion(question, tag);
//			return "redirect:/questions";
//	
//	}
	
	@PostMapping("/create/question")
	public String createQuestion(@Valid @ModelAttribute("new")Question quest, BindingResult results) {
		validator.validate(quest, results);
		if(results.hasErrors()) {
			return "new_question.jsp";
		}
		else {
		oService.createQuestion(quest);
			return "redirect:/questions";
		}
	}
	
	@GetMapping("/questions/{id}")
	public String profile(@ModelAttribute ("addAnswer")Answer answer, @PathVariable ("id") Long id, Model model) {
		model.addAttribute("getOneQ",oService.getOneQuestion(id));
//		model.addAttribute("getOneT", oService.getOneTag(id));
		return "question_profile.jsp";
	}
	
	@PostMapping("/add/answer")
	public String answer(@Valid @ModelAttribute ("addAnswer")Answer answer, BindingResult result, Model model){
		if(result.hasErrors()) {
			model.addAttribute("getOneQ",oService.getOneQuestion(answer.getQuestion().getId()));
			return "question_profile.jsp";
		}
		else {
			oService.createAnswer(answer);
			return "redirect:/questions/" + answer.getQuestion().getId();
		}
	}
}
