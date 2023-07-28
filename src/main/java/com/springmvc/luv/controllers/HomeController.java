package com.springmvc.luv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homeController()
	{
		return "homePage";
	}
	
	@RequestMapping("/process-Home")
	public String processHome(@RequestParam String txtuname , 
			@RequestParam("txtcrush") String crush,
			Model model)
	{
		model.addAttribute("name", txtuname);
		model.addAttribute("crush", crush);
		System.out.println("Your Name: "+ txtuname );
		System.out.println("Crush Name: "+ crush );
		return "homeResultPage";
	}
}
