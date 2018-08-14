package com.skmangalam.mywebapp.services;

import com.skmangalam.mywebapp.models.Post;
import com.skmangalam.mywebapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServices {

    @Autowired
    PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public Post savePost(Post post){
        return postRepository.save(post);
    }
}
