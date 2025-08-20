package com.emojitexttools.emojitexttools.web;

import com.emojitexttools.emojitexttools.service.impl.EmojiServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmojiesController {
    private final EmojiServiceImpl emojiService;

    public EmojiesController(EmojiServiceImpl emojiService) {
        this.emojiService = emojiService;
    }

    @GetMapping("/emojies")
    public String getEmojies(@RequestParam(defaultValue = "all") String category, Model model) {
        List<String> selectedEmojies = emojiService.findByCategory(category);
        List<List<String>> partitionedEmojis = new ArrayList<>();
        for (int i = 0; i < selectedEmojies.size(); i += 10) {
            partitionedEmojis.add(selectedEmojies.subList(i, Math.min(i + 10, selectedEmojies.size())));
        }
        model.addAttribute("emojies",partitionedEmojis);
        model.addAttribute("selectedCategory", category);
        return "emojies";
    }
}
