package com.coding.dojoOverflow.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coding.dojoOverflow.models.Question;
import com.coding.dojoOverflow.models.Tag;
import com.coding.dojoOverflow.services.OverFlowService;

@RestController
public class ApiController {

	@Autowired
	private OverFlowService oService;
	
	@Autowired
	private OverFlowService tService;
	
//	get all questions
	@GetMapping("/allQuestions/api")
	private List<Question> allQuestions() {
		return oService.getAllQuestions();
	}
	
//	create a question
//	@GetMapping("/create/question/api")
//	private Question createQuestion(Question question) {
//		return  oService.createAQuestion(question);
//	}
	
//	get one question
//	@GetMapping("/getOneQuestion/{id}/api")
//	private Question getOne(@PathVariable ("id") Long id) {
//		return oService.getOneQuestion(id);
//	}
	
//	get all tags
	@GetMapping("/allTags/api")
	private List<Tag> allTags() {
		return tService.getAllTags();
	}
	
//	create a tag
	@GetMapping("/create/tag/api")
	private Tag createTag(Tag t) {
		return  tService.createATag(t);
	}
	
//	get one tag
//	@GetMapping("/getOneTag/{id}/api")
//	private Tag getOneTag(@PathVariable ("id") Long id) {
//		return tService.getOneTag(id);
//	}
}
