package com.example.PostApi.controller;

import com.example.PostApi.model.Post;
import com.example.PostApi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/v1/post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping(value = "/createPost")
    public String savePost(@RequestBody Post newPost){
        postService.save(newPost);
        return "save Post";
    }

    @GetMapping(value = "getPost")
    public List<Post> getPost(){
        return postService.findAll();
    }
}
//http://18.116.36.49:8081/swagger-ui/index.html#/post-controller
//http://localhost:8080/swagger-ui/index.html#/library-controller