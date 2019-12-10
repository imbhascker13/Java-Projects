package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee, ModelMap map) {
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee>result= employeeRepository.findAll(); 
		return result;
	}

}
