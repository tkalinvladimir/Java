package com.tkalin.blog.service.impl;

import com.tkalin.blog.dto.PostDTO;
import com.tkalin.blog.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemPostService implements PostService {

    private ArrayList<PostDTO> posts = new ArrayList<PostDTO>(Arrays.asList(
            PostDTO.builder()
                    .title("1 title")
                    .body("1 body")
                    .img("/img/1.jpg")
                    .build(),
            PostDTO.builder()
                    .title("2 title")
                    .body("2 body")
                    .img("/img/2.png")
                    .build(),
            PostDTO.builder()
                    .title("3 title")
                    .body("3 body")
                    .img("/img/3.png")
                    .build())
    );

    @Override
    public List<PostDTO> search(String query) {
        return query != null && !query.isEmpty() ?
                posts.stream().filter(post -> post.getTitle().toLowerCase().matches(".*" + query.toLowerCase() + ".*")).collect(Collectors.toList())
                :
                posts
                ;
    }
}
