package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user;
import com.example.demo.repository.userRepository;

@RestController
public class userController 
{
	@Autowired
	private userRepository userrepository;
	
	@RequestMapping("/adduser")
	public String saveUser(@RequestBody user details)
	{
	userrepository.save(details);
	return "rigistration successfull";
		
	}
	
	@RequestMapping("/getuser")
	public List<user>  getuser()
	{
	List<user> u =userrepository.findAll();
	return u;
	}
	
	@RequestMapping("/delete")
	public void delete(Integer id)
	{
		
		userrepository.deleteById(id);
	}
	
	@RequestMapping("/edit")
	public void edit(@RequestBody user user1)
	{
		
		userrepository.save(user1);
	}
	

}
