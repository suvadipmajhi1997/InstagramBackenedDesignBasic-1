package com.geekster.Instagram.services;


import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repo.IPostRepository;
import com.geekster.Instagram.repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {

    @Autowired
    IPostRepository postRepository;

    @Autowired
    ITokenRepo tokenRepository;

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepository.findFirstByToken(token).getUser();
        List<Post> posts = postRepository.findByUser(user);
        return posts;
    }
}
