package com.pdw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pdw.entity.Employee;
import com.pdw.service.EmployeeService;



@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:7071")
public class DeleteEmpController {
	@Autowired
	RestTemplate rest;
	 @Autowired
	    EmployeeService employeeService;
	  
	   @DeleteMapping("/deleteEmployee/{eid}")
	   public String deleteEmployee(@PathVariable("eid") int eid) {
		   Employee e=rest.getForObject("http://localhost:7073/Employee/findEmployeeWithId/"+eid,Employee.class);
		 if(e!=null) {
	       employeeService.deleteEmployee(e.getEid());
  return "Employee with id="+e.getEid()+" has been Deleted";
}else {
			return "Employee id doesn't exists!";
}}}