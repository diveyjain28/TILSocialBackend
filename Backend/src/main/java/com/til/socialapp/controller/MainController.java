package com.til.socialapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.til.socialapp.model.Employee;
import com.til.socialapp.model.Like;
import com.til.socialapp.model.Post;
import com.til.socialapp.service.EmployeeService;
import com.til.socialapp.service.LikeService;
import com.til.socialapp.service.PostService;

@RestController
@RequestMapping("/tilsocialapp")
public class MainController 
{
	@Autowired
	private EmployeeService empserv;
	@Autowired
	private PostService postserv;
	@Autowired
	private LikeService likeserv;
	@PostMapping("/profile/save")
	public String register(@RequestBody Employee emp)
	{
		empserv.registerService(emp);
		return "User registered successfully";
	}
	
	@PostMapping("/post/save")
	public String savePost(@RequestBody Post post)
	{
		postserv.savePostService(post);
		return "Post saved successfully";
	}
	
	@PostMapping("/like/save")
	public String likePost(@RequestBody Like like)
	{
		likeserv.likePostService(like);
		return "Post liked successfully";
	}
	
}
