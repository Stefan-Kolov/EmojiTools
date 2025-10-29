package com.emojitexttools.emojitexttools.service;

import com.emojitexttools.emojitexttools.model.Emoji;

import java.util.List;

public interface EmojiService {
    List<Emoji> findByCategory(String category);
    List<Emoji> findByName(String name);
}
