package com.sscce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigitsOnlyValidator implements ConstraintValidator<DigitsOnly, Integer> {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void initialize(DigitsOnly constraintAnnotation) {
	
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		log.info("Inside DigitsOnlyValidator, value recieved is: " + value);	
		
		//forget about validating anything at this time. Just return true. 
		return true;

	/*	if (value == null) {
			System.out.println("value is null ".toUpperCase());
			return true;
		} else {
			try {
				int num = Integer.parseInt(value.toString());
				System.out.println("num is: "+ num + " no exception: ".toUpperCase());
				return true;
			} catch (NumberFormatException e) {
				System.out.println("EXCEPTION: " + e.getMessage().toUpperCase());
				return false;
			}
		}*/
	}

}
