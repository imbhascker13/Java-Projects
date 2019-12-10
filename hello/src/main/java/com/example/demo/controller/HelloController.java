package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;
@Controller
public class HelloController {
	@Autowired
	EmployeeService employeeService;
	 @RequestMapping("/a")
	   public String index() {
	      return "index";
	   }
	   @PostMapping("/hello")
	   public String addEmployee(@ModelAttribute("userDetails") Employee employee,ModelMap map) {
		   	employee=employeeService.addEmployee(employee,map);
		   	map.addAttribute("name", employee.getName());
		   	map.addAttribute("mid", employee.getMid());
			map.addAttribute("salary", employee.getSalary());
		   	return "hello";
	   }
//	   @RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
//	   public ModelAndView getUserDetails() {
//	       ModelAndView model = new ModelAndView("/userDetails");
//	       
//	       Employee employee=new Employee();
//	       employee.setMid("M1056201");
//	       employee.setName("rohit");
//	       employee.setSalary("122345");
//	       
//	       model.addObject("employee", employee);
//	       return model;
	   
	   @GetMapping("/userDetails")
	   public String getEmployee(ModelMap model) {
		List<Employee> employee=employeeService.getEmployee();
		 model.addAttribute("employee",employee);
		 return "userDetails";
	   }
}
