package com.TILSocial.Backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.TILSocial.Backend.Model.Employee;
import com.TILSocial.Backend.Model.Post;

public interface PostRepository extends MongoRepository<Post, Integer>{

}
