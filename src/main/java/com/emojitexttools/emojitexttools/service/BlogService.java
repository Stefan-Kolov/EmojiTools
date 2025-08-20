package com.emojitexttools.emojitexttools.service;

import com.emojitexttools.emojitexttools.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog add(Blog blog);
}
