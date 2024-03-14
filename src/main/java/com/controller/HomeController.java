package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Employee;

@Controller
public class HomeController {

	@RequestMapping(path="/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(path="/addEmp")
	public String addEmp()
	{
		return "addEmp";
	}
	
	@RequestMapping(path="/createEmp",method=RequestMethod.POST)
	public String createEmp(@ModelAttribute Employee emp)
	{
		System.out.println(emp);
		return "addEmp";
	}
}
