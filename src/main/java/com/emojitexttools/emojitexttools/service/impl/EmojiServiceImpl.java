package com.emojitexttools.emojitexttools.service.impl;

import com.emojitexttools.emojitexttools.model.Emoji;
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
    public List<Emoji> findByCategory(String category) {
        return emojiRepository.findByCategory(category);
    }

    @Override
    public List<Emoji> findByName(String name) {
        return emojiRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Emoji> findAll() {
        return emojiRepository.findAll();
    }

}
