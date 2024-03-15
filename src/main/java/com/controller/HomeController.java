package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmpDao;
import com.entity.Employee;

@Controller
public class HomeController {

	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(path="/home")
	public String home(Model m)
	{
		List<Employee> list = empDao.getAllEmp();
		m.addAttribute("empList",list);
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
		int i=empDao.saveEmp(emp);
		return "redirect:/home";
	}
	
	@RequestMapping(path="editEmp/{id}")
	public String editEmp(@PathVariable int id,Model m)
	{
		Employee emp = empDao.getEmpById(id);
		m.addAttribute("emp",emp);
		return "editEmp";
	}
	
	@RequestMapping(path="updateEmp", method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee emp)
	{
		empDao.update(emp);
		return "redirect:/home";
	}
	
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id)
	{
		empDao.deleteEmp(id);
		return "redirect:/home"; 
	}
	
}
