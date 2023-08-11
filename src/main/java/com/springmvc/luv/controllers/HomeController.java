package com.springmvc.luv.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String processHome(@Valid @ModelAttribute("userInfo")HomeModel homeModel,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			//List<ObjectError> errors=result.getAllErrors();
			return "homePage";
		}
		model.addAttribute("userInfo", homeModel);
		return "homeResultPagePost";
	}
}
