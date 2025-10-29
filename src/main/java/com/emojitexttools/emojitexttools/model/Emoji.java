package com.emojitexttools.emojitexttools.model;

import lombok.Data;

@Data
public class Emoji {
    private String emoji;
    private String name;

    public Emoji(String emoji, String name) {
        this.emoji = emoji;
        this.name = name;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getName() {
        return name;
    }
}
