package com.coding.dojoOverflow.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.coding.dojoOverflow.models.Question;

@Component
public class TagValidator {

    public boolean supports(Class<?> clazz) {
        return Question.class.equals(clazz);
    }
    
    public void validate(Object target, Errors errors) {
        Question q = (Question) target;
        String [] tags = q.getTagsFromFrontEnd().split(", ");
        if(tags.length > 3) {
        	errors.rejectValue("tagsFromFrontEnd", "too Many", "Must have 3 tags or less");
        }
  
    }
}
