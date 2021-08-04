package com.til.socialapp.service;

import org.springframework.stereotype.Service;
import com.til.socialapp.model.Post;
import com.til.socialapp.repository.PostRepository;


@Service
public class PostService 
{
	private PostRepository post;
	public PostService(PostRepository post) {
		super();
		this.post = post;
	}
	public void savePostService(Post p)
	{
		post.save(p);
	}
}
