package com.emojitexttools.emojitexttools.model;

import lombok.Data;

@Data
public class Blog {
    private String title;
    private String description;

    public Blog(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
