package com.til.socialapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.til.socialapp.model.Employee;
import com.til.socialapp.model.Post;

public interface PostRepository extends MongoRepository<Post, Integer>{

}
