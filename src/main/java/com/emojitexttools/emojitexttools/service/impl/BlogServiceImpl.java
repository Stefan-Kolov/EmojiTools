package com.emojitexttools.emojitexttools.service.impl;

import com.emojitexttools.emojitexttools.model.Blog;
import com.emojitexttools.emojitexttools.repository.BlogRepository;
import com.emojitexttools.emojitexttools.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Blog add(Blog blog) {
        return null;
    }
}
