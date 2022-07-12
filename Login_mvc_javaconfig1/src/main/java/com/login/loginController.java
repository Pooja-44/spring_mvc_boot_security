package com.login;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.user.user;

@Controller
public class loginController 
{
	
	static Set<user> l=new HashSet<user>();
	
	
	

	
	
	
	@RequestMapping("/log")
	public  String login(@RequestParam("username") String  user,@RequestParam("password") String  pass,@RequestParam("gmail") String  gmail)
	{
		
		l.add(new user("pooja", "poo@44", "poo@gmail.com"));
		for(user li:l)
		{
		
		if(pass.equals(li.getPassword())&&gmail.equals(li.getGmail()))
		return "display.jsp";
		
		}
		return "failure.jsp";
		
		
		
		
		
	}
		

}


