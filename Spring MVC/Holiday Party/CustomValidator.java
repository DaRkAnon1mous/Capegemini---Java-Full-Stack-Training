package com.validate;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator{

	
	public void validate(Object arg0, Errors arg1) {
		RegistrationBean rb=(RegistrationBean)arg0;
		if(rb.getUserName()==null||rb.getUserName().isEmpty()) {
			arg1.rejectValue("userName", null, "User Name cannot be blank");
		}
		if(	String.valueOf(rb.getContactNumber()).length()!=10||rb.getContactNumber()==0) {
			arg1.rejectValue("contactNumber", null,"Contact Number should be of 10 digits/Contact Number should not be blank");
		}
		if(rb.getConfirmEmailId().isEmpty()||rb.getEmailId()==null) {
			arg1.rejectValue("emailId", null,"Email ID cannot be blank\nShould be a proper email ID format");
		}
		if(rb.getConfirmEmailId().isEmpty()||!rb.getEmailId().equals(rb.getConfirmEmailId())) {
			arg1.rejectValue("confirmEmailId",null,"Confirm Email ID cannot be blank\nShould be a proper email ID format");
		}
		if(!rb.isStatus()) {
			arg1.rejectValue("status", null, "please agree to the terms and conditions");
		}
		
	
	}

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
