package com.emojitexttools.emojitexttools.repository;

import com.emojitexttools.emojitexttools.bootstrap.DataHolder;
import com.emojitexttools.emojitexttools.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {
    public List<Blog> findAll(){
        return DataHolder.blogs;
    }

    public Blog addBlog(Blog blog){
        DataHolder.blogs.add(blog);
        return blog;
    }
}
