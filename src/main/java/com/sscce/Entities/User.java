package com.sscce.Entities;

import javax.validation.constraints.Pattern;

import com.sscce.validation.NotBlankNoFancyLettersOrNumbers;

public class User {

	@NotBlankNoFancyLettersOrNumbers(message = "{validate.user.name}")
	private String name;
	@Pattern(regexp="(^$|[0-9]{10})", message = "{validate.user.phone}")
	private String phone;
	//first try this as this is built-in constraint: @Digits(fraction = 0, integer = 5, message = "{validate.user.yearsexperience}")
	//second try this as this annotation is made by me: @DigitsOnly(message = "{validate.user.yearsexperience}")
	//third thing to do is WebDataBinder.addValidator(new DigitsValidatorForBinder());
	private Integer yearsExperience;
	
	
	public User() {
		super();
	}
	public User(String name, String phone, Integer yearsExperience) {
		super();
		this.name = name;
		this.phone = phone;
		this.yearsExperience = yearsExperience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getYearsExperience() {
		return yearsExperience;
	}
	public void setYearsExperience(Integer yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((yearsExperience == null) ? 0 : yearsExperience.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (yearsExperience == null) {
			if (other.yearsExperience != null)
				return false;
		} else if (!yearsExperience.equals(other.yearsExperience))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", yearsExperience=" + yearsExperience + "]";
	}
	
}
