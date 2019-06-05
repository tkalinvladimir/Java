package com.tkalin.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// data from lombock creates getters and setters for all fields in class marked as @data
@Data
@Builder  // builder pattern
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private String title;
    private String body;
    private String img;
}
