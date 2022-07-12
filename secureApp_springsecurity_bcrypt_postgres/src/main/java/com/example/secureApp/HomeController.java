package com.example.secureApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public  String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/login")
	public  String loginpage()
	{
		return "login.jsp";
	}
	@RequestMapping("/logout-success")
	public  String logoutpage()
	{
		return "logout.jsp";
	}
	
	
	

}
