package com.tkalin.blog.service.impl;

import com.tkalin.blog.domain.Post;
import com.tkalin.blog.dto.PostDTO;
import com.tkalin.blog.jpa.PostRepo;
import com.tkalin.blog.service.api.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DBPostService implements PostService {

    private final PostRepo postRepo;

    public DBPostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public List<PostDTO> search(String query) {
        List<Post> posts = query != null && !query.isEmpty() ? postRepo.findAllByTitleLike("%"+query.toLowerCase()+"%") : postRepo.findAll();
        return posts.stream().map(post -> PostDTO.builder().title(post.getTitle()).body(post.getBody()).img(post.getImg()).build()).collect(Collectors.toList());
    }

   // comment after first launch to fill in db
   /* @PostConstruct
    public void setup() {
     postRepo.saveAll(Arrays.asList(
             Post.builder()
                     .title("1 title")
                     .body("1 body")
                     .img("/img/1.jpg")
                     .build(),
             Post.builder()
                     .title("2 title")
                     .body("2 body")
                     .img("/img/2.png")
                     .build(),
             Post.builder()
                     .title("3 title")
                     .body("3 body")
                     .img("/img/3.png")
                     .build()));
    }*/
}
