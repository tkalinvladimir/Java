package com.tkalin.blog.service.api;

import com.tkalin.blog.dto.PostDTO;

import java.util.List;

public interface PostService {
    public List<PostDTO> search(String query);
}
