package com.emojitexttools.emojitexttools.service.impl;

import com.emojitexttools.emojitexttools.repository.EmojiRepository;
import com.emojitexttools.emojitexttools.service.EmojiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmojiServiceImpl implements EmojiService {

    private final EmojiRepository emojiRepository;

    public EmojiServiceImpl(EmojiRepository emojiRepository) {
        this.emojiRepository = emojiRepository;
    }

    @Override
    public List<String> findAll() {
        return emojiRepository.findAll();
    }

    @Override
    public List<String> findByCategory(String category) {
        return emojiRepository.findByCategory(category);
    }

}
