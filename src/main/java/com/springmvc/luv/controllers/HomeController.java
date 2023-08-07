package com.springmvc.luv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.luv.model.HomeModel;

@Controller
public class HomeController {

	@Autowired
	HomeModel userInfo;
	
	@RequestMapping("/")
	public String homeController(Model model)
	{
		model.addAttribute("userInfo", userInfo);
		return "homePage";
	}
	
	@RequestMapping(path = "/process-Home", method=RequestMethod.GET)
	public String processHome(@RequestParam String txtuname , 
			@RequestParam("txtcrush") String crush,
			Model model)
	{
		model.addAttribute("name", txtuname);
		model.addAttribute("crush", crush);
		return "homeResultPageGet";
	}
	
	@RequestMapping(path = "/process-Home", method=RequestMethod.POST)
	public String processHome(HomeModel homeModel,Model model)
	{
		
		model.addAttribute("userInfo", homeModel);
		return "homeResultPagePost";
	}
}
