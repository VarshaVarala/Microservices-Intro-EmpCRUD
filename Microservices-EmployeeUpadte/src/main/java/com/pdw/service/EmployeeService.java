package com.pdw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pdw.dao.EmployeeDao;
import com.pdw.entity.Employee;
@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public String updateEmployee(Employee employee) {
		boolean result=empDao.exists(employee.getEid());
		if(result) {
			empDao.save(employee);
			return "Employee Updated successfully!";
		}
		else {
			empDao.save(employee);
		return "New employee is inserted";
		}
	}
}
