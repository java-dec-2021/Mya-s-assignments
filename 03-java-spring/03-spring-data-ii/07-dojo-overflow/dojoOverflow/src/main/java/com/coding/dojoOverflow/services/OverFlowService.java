package com.coding.dojoOverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.dojoOverflow.models.Answer;
import com.coding.dojoOverflow.models.Question;
import com.coding.dojoOverflow.models.Tag;
import com.coding.dojoOverflow.repositories.AnswerRepository;
import com.coding.dojoOverflow.repositories.QuestionRepository;
import com.coding.dojoOverflow.repositories.TagRepository;

@Service
public class OverFlowService {
	
	@Autowired
	private TagRepository tRepo;
	
	@Autowired
	private QuestionRepository qRepo;
	
	@Autowired
	private AnswerRepository aRepo;
	
	//	get all tags
	public List<Tag> getAllTags() {
		return this.tRepo.findAll();
	}
	
////	get a tag
	public Tag getOneTag(Long id) {
		return tRepo.findById(id).orElse(null);
	}
	
//	create a tag
	public Tag createATag(Tag t) {
		return tRepo.save(t);
	}
	
	public Tag getOneTag(String tag) {
		return tRepo.findByTag(tag);
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQuest = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsByTag(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQuest.add(tagToAdd);
			}
			else {
				Tag newTag = new Tag();
				newTag.setTag(s);
				this.tRepo.save(newTag);
				tagsForQuest.add(this.getOneTag(s));
			}
		}
		return tagsForQuest;
	}
	
	public Question createQueston(Question q) {
		q.setTags(this.splitTags(q.getTagsFromFrontEnd()));
		return this.qRepo.save(q);
	}
	
//	methodoverloading
//	public Question createQuestion(String q, String tag) {
//		
////		lets turn string into question
//		Question question = new Question(q);
//		question.setTags(this.splitTags(tag));
//		
//		return this.qRepo.save(question);
//	}
	
	
	
//	******************* Question *******************
//	get all questions
	public List<Question> getAllQuestions(){
		return qRepo.findAll();
	}
	
//	get a question
	public Question getOneQuestion(Long id) {
		return qRepo.findById(id).orElse(null);
	}
	
//	create a question
	public Question createQuestion(Question q) {
		return qRepo.save(q);
	}
	
//	******************* Answer *********************
//	get all answers
	public List<Answer> getAllAnswers(){
		return aRepo.findAll();
	}
	
//	create an answer
	public Answer createAnswer(Answer a) {
		return aRepo.save(a);
	}
}
