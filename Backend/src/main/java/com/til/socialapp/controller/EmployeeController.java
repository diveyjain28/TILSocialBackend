package com.til.socialapp.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.til.socialapp.model.Comment;
import com.til.socialapp.model.Employee;
import com.til.socialapp.repository.EmployeeRepository;
import com.til.socialapp.service.CommentService;
import com.til.socialapp.service.EmployeeService;

@RestController
@RequestMapping("/tilsocialapp")
public class EmployeeController 
{
	@Autowired
	private EmployeeService demo;
	@Autowired
	private CommentService como;
	@PostMapping("/profile/save")
	public String register(@RequestBody Employee emp)
	{
		demo.registerService(emp);
		return "User registered successfully";
	}
	@GetMapping("/profile/fetch/{empId}")
	public Employee fetchEmployeeById(@PathVariable("empId") int empId)
	{
		Employee ret=demo.fetchServiceEmployeeById(empId);
		return ret;
	}
	
	@PostMapping("/comment/save")
	public String registerComment(@RequestBody Comment comment)
	{
		como.registerServiceComment(comment);
		return "User registered successfully";
	}

	@GetMapping("/comment/fetch/{postId}")
	public List<Comment> fetchComment(@PathVariable("postId") ObjectId postId)
	{
		List<Comment> ret=como.fetchServiceComment(postId);
		return ret;
	}
	
	
	
}
