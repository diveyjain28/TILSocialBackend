package com.til.socialapp.service;

import org.springframework.stereotype.Service;

import com.til.socialapp.model.Employee;
import com.til.socialapp.repository.EmployeeRepository;


@Service
public class EmployeeService 
{
	private EmployeeRepository emp;
	public EmployeeService(EmployeeRepository emp) {
		super();
		this.emp = emp;
	}
	public void registerService(Employee e)
	{
		emp.save(e);
	}
}
