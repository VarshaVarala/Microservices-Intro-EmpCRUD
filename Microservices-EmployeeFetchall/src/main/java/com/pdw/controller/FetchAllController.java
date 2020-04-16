package com.pdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pdw.entity.Employee;
import com.pdw.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:7074")
public class FetchAllController {
	 @Autowired
	    EmployeeService employeeService;
	 
	 @Autowired
		RestTemplate rest;
	 
	   @GetMapping("/findAllEmployees")
	   public List<Employee>findAllEmployees(){
		   List<Employee>employees=employeeService.findAllEmployees();
		   return employees; 
	   }

}
