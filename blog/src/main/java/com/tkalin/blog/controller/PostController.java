package com.tkalin.blog.controller;

import com.tkalin.blog.service.api.PostService;
import com.tkalin.blog.service.impl.MemPostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(@Qualifier("DBPostService") PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String hello(Model model, @RequestParam(name = "query", required = false) String query) {
        model.addAttribute("posts", postService.search(query));
        return "hello";
    }

}
