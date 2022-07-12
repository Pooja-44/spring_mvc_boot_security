package com.example.emp_q5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.emp_q5.model.Emp;
import com.example.emp_q5.repository.empRepo;

@Controller
public class empController 
{
	
//	Adding employee
	
	@RequestMapping("/")
	public String register()
	{
		return "index";
	}
	
	@Autowired
	empRepo repo;
	
	@RequestMapping("/addemp")
	public  String registerd( Emp employee)
	{
		repo.save(employee);
		
		return "index";
	}
	
//	 finding employee by ID
	@RequestMapping("/getemp")
	public String fingemp()
	{
		return "search";
	}

	
	@RequestMapping("/get")
	public  ModelAndView getemp(@RequestParam Integer id)
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("search");
		Emp e=repo.findById(id).orElse(new Emp());
		mv.addObject("obj",e);
         return mv;
	}
	
//	find all
	
	@RequestMapping("/getAll")
	public  ModelAndView getemp()
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("searchAll");
		Iterable<Emp> e=repo.findAll();
		mv.addObject("obj",e);
         return mv;
	}
	
//	delete
	
	@RequestMapping("/deleteemp")
	public String del()
	{
		return "delete";
	}
	@RequestMapping("/delete")
	public String  deleteemp(@RequestParam int id)
	{
		System.out.print(id);
		
		 repo.deleteById(id);
		 return "index";
		
	}
	
//	edit
	
	

}
