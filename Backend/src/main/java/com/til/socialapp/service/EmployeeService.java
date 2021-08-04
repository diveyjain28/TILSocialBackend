package com.til.socialapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.til.socialapp.model.Employee;
import com.til.socialapp.repository.EmployeeRepository;


@Service
public class EmployeeService 
{
	
	//you can use @autowire employee Repository, no need to pass to the constructor
	private EmployeeRepository emp;
	
	
	public EmployeeService(EmployeeRepository emp) {
		super();
		this.emp = emp;
	}
	public void registerService(Employee e)
	{
		emp.save( e);
	}
	
	
	//see how to fetch a record using a field value, don't fetch all record and then filter
	
	public Employee fetchServiceEmployeeById(int empId) {
	    Employee ret =null;
		List <Employee> e=emp.findAll();
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).getEmpId()==empId)
			{
				ret=e.get(i);
			}
		}
		return ret;
	}
}
