package com.pdw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pdw.entity.Employee;
import com.pdw.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:7072")
public class UpdateController {
	
	@Autowired
	RestTemplate rest;
	 @Autowired
	    EmployeeService employeeService;
	 
	 
	   @PutMapping("/updateEmployee")
	   public String updateEmployee(@RequestBody Employee employee) {
		   Employee e = rest.getForObject("http://localhost:7073/Employee/findEmployeeWithId/"+employee.getEid(),Employee.class);
		  if(e!=null) {
		   employeeService.updateEmployee(e);
	       return "Employee has been updated";
	   }else {
		   return "no employee found with id as"+ employee.getEid();
	   }
}}
