package com.simpleIntrest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simpleIntrest.service.servicecalculate;

@Controller
public class CalculateController 
{

	@RequestMapping("/cal")
 public ModelAndView Calculate(HttpServletRequest request,HttpServletResponse response)
 {
		
	double p=Double.parseDouble(request.getParameter("priciple"));
	int t=Integer.parseInt(request.getParameter("year"));
	double r=Double.parseDouble(request.getParameter("rate"));
	
	servicecalculate s=new servicecalculate();
	double result=s.calculate(p, t, r);
	
	
	ModelAndView mv=new ModelAndView();
	mv.setViewName("display.jsp");
	mv.addObject("result",result);
		
	 return mv;
 }
}
