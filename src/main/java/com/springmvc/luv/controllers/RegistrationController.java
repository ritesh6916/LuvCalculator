package com.springmvc.luv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.luv.model.RegistrationModel;

@Controller
public class RegistrationController {

	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("registrationModel") RegistrationModel registrationModel) {
		
		registrationModel.setTxtname("Ritesh");
		
		return "registrationPageHome";
	}
}
