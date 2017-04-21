package com.sscce.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sscce.Entities.User;

@Component
public class DigitsValidatorForBinder implements Validator {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {		

		User user = (User) target;		
		log.info("User name: " + user.getName());
		log.info("User Experience: " + user.getYearsExperience());
		
		//no point of validating it anymore since I am not getting the incorrect value
		
		
		/* //It will throw NullPointerException
		   String a = Integer.toString(user.getYearsExperience());		
		if(!a.matches("[0-9]+")){			
			errors.rejectValue("yearsexperience","validate.user.yearsexperience");
		} 		*/
	}
}
	

