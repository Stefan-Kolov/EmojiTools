package com.emojitexttools.emojitexttools.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Emoji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emoji;

    private String name;

    private String category;

    public Emoji(String emoji, String name) {
        this.emoji = emoji;
        this.name = name;
    }

    public Emoji() {

    }
}
