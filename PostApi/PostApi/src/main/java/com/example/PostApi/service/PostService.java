package com.example.PostApi.service;

import com.example.PostApi.Repository.PostRepo;
import com.example.PostApi.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    public void save(Post newPost) {
         postRepo.save(newPost);
    }

    public List<Post> findAll() {
        return postRepo.findAll();
    }
}
