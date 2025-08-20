package com.emojitexttools.emojitexttools.service;

import java.util.List;

public interface EmojiService {
    List<String> findAll();
    List<String> findByCategory(String category);
}
