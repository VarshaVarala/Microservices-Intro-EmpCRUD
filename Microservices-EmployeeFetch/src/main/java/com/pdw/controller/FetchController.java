package com.pdw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pdw.entity.Employee;
import com.pdw.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:7073")
public class FetchController {
	
	 @Autowired
	    EmployeeService employeeService;
	 
	 @Autowired
		RestTemplate rest;

	 @GetMapping(value = "/findEmployeeWithId/{id}")
		public Employee findEmployeeByIdCounty(@PathVariable int id){
				Employee e = employeeService.findEmployeeById(id);
				System.out.println("The emp "+e);
			return e;
		}
			   


}
