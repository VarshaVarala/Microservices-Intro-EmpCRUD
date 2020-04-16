package com.pdw.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdw.dao.EmployeeDao;
import com.pdw.entity.Employee;
@Service
public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	EmployeeDao empDao;
	
	
	@Override
	public Employee findEmployeeById(int id) {
		return empDao.findOne(id);
	}

}
