package com.til.socialapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.til.socialapp.model.Employee;
import com.til.socialapp.repository.EmployeeRepository;
import com.til.socialapp.service.EmployeeService;

@RestController
@RequestMapping("/tilsocialapp")
public class EmployeeController 
{
	@Autowired
	//private EmployeeRepository demo;
	private EmployeeService demo;
	@PostMapping("/profile/save")
	public String register(@RequestBody Employee emp)
	{
		demo.registerService(emp);
		return "User registered successfully";
	}
}
