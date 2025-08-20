package com.emojitexttools.emojitexttools.web;

import com.emojitexttools.emojitexttools.model.Blog;
import com.emojitexttools.emojitexttools.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogsController {

    private final BlogService blogService;

    public BlogsController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public String getBlogs(Model model) {
        model.addAttribute("blogsList",blogService.findAll());
        return "blogs";
    }

    @PostMapping("/blogs/add")
    public String addBlog(@RequestParam String title, @RequestParam String description) {
        if(title != null && description != null) {
            blogService.add(new Blog(title, description));
            return "redirect:/blogs";
        }
        return "redirect:/blogs";
    }
}
