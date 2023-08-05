package com.springmvc.luv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.luv.model.RegistrationModel;

@Controller
public class RegistrationController {

	
	@RequestMapping("/register")
	public String showRegistrationPage( Model model)
	{
		RegistrationModel registrationModel=new RegistrationModel();
		model.addAttribute("registrationModel", registrationModel);
		return "registrationPageHome";
	}
}
