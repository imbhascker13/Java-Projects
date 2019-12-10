package com.example.demo.Service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee,ModelMap map);

	public List<Employee> getEmployee();

}
