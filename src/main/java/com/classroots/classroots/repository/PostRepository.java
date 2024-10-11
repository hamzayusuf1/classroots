package com.classroots.classroots.repository;

import com.classroots.classroots.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
