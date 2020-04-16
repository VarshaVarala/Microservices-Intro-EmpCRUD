package com.pdw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdw.dao.EmployeeDao;
import com.pdw.entity.Employee;
@Service
public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees=empDao.findAll();
		return employees;
	}
	
}
