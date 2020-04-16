package com.pdw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pdw.dao.EmployeeDao;
import com.pdw.entity.Employee;


@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public String deleteEmployee(int eid) {
		boolean result=empDao.exists(eid);
		if(result) {
			Employee e=empDao.findOne(eid);
			empDao.delete(e);
			return "deleted successfully!";
		}
		else
		return "Employee doesn't exists";
	}

}
