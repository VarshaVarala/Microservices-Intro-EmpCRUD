package com.pdw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdw.entity.Employee;
import com.pdw.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:7070")
public class CreateEmpController {
	
	 @Autowired
	    EmployeeService employeeService;
	
	  @PostMapping("/createEmployee")
	    public String createEmployee(@RequestBody Employee employee) {
	    employeeService.createEmployee(employee);
	    	 return "employee created with id : "+employee.getEid();
	     }

}
