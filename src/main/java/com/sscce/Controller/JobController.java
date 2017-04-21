package com.sscce.Controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sscce.Entities.User;
import com.sscce.validation.DigitsValidatorForBinder;

@Controller
public class JobController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@InitBinder("user")
	protected void binder(WebDataBinder binder) {
		binder.addValidators(new DigitsValidatorForBinder()); 
	}

	@GetMapping({ "/", "/userinfo" })
	public String getUserInfo(Model model) {		
		model.addAttribute("user", new User());		
		return "userinfo";
	}
	
	@PostMapping("/thankyou")
	public String thanks(@Valid @ModelAttribute("user") User user, Errors errors, Model model) {	
		
		if (errors.hasErrors()){
			//this error below will not read and set the error from validation.properties file. 
			errors.getAllErrors().forEach(item->log.info("Found Error(s): " + item.getDefaultMessage())); 
			model.addAttribute("errors", errors.getAllErrors());
			return "userinfo";
		}
		
		model.addAttribute("user", user);
		return "thankyou";
	}

}
