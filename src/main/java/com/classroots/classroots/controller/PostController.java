package com.classroots.classroots.controller;

import com.classroots.classroots.repository.PostRepository;
import com.classroots.classroots.model.Post;
import com.classroots.classroots.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> getSpecificPost(@PathVariable String text) {
        return srepo.findByText(text);
    }


    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }

}
