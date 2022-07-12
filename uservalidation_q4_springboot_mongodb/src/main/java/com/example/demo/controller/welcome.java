package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcome {
	@RequestMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("message", "welcome spring boot");
		return "index";
		
	}

}
