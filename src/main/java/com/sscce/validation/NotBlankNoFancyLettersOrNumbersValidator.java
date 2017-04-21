package com.sscce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotBlankNoFancyLettersOrNumbersValidator implements ConstraintValidator<NotBlankNoFancyLettersOrNumbers, String> {

	@Override
	public void initialize(NotBlankNoFancyLettersOrNumbers constraintAnnotation) {
	
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value != null)
			return value.trim().length() > 0;
		return true;
	    
	}

}
