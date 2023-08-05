package com.springmvc.luv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage()
	{
		
		return "registrationPageHome";
	}
}
