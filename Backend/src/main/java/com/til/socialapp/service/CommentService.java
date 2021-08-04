package com.til.socialapp.service;

import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;


import com.til.socialapp.model.Comment;
import com.til.socialapp.repository.CommentRepository;
@Service
public class CommentService {
    CommentRepository cr;
    
	public CommentService(CommentRepository cr) {
		super();
		this.cr = cr;
	}
	public void registerServiceComment(Comment comment) {
		
		cr.save(comment);
		
	}
	public List<Comment> fetchServiceComment(ObjectId postId) {
	    List<Comment> c=cr.findAll();
	    List<Comment> ret = new ArrayList<Comment>() ;
		for(int i=0;i<c.size();i++)
		{
			if(c.get(i).getPostId().equals(postId))
			{
				ret.add(c.get(i));
			}
		}
		return ret;
	}

}
