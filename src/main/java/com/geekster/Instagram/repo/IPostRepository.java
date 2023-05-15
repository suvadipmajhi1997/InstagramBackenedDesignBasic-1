package com.geekster.Instagram.repo;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUser(User user);
}

