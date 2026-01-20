package com.emojitexttools.emojitexttools.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emoji emoji1 = (Emoji) o;
        return Objects.equals(id, emoji1.id) && Objects.equals(emoji, emoji1.emoji) && Objects.equals(name, emoji1.name) && Objects.equals(category, emoji1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emoji, name, category);
    }
}
