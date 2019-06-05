package com.tkalin.blog.jpa;

import com.tkalin.blog.domain.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

    List<Post> findAllByTitleLike(String query);

}
