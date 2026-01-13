package com.emojitexttools.emojitexttools.web;

import com.emojitexttools.emojitexttools.model.Emoji;
import com.emojitexttools.emojitexttools.service.EmojiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmojiesController {
    private final EmojiService emojiService;

    public EmojiesController(EmojiService emojiService) {
        this.emojiService = emojiService;
    }

    @GetMapping("/emojies")
    public String getEmojies(
            @RequestParam(defaultValue = "all") String category,
            @RequestParam(value = "query", required = false) String query,
            Model model) {

        List<Emoji> selectedEmojies;

        if (query != null && !query.trim().isEmpty()) {
            selectedEmojies = emojiService.findByName(query);
        } else if (category.equals("all")) {
            selectedEmojies = emojiService.findAll();
        } else {
            selectedEmojies = emojiService.findByCategory(category);
        }

        List<List<Emoji>> partitionedEmojis = new ArrayList<>();
        for (int i = 0; i < selectedEmojies.size(); i += 10) {
            partitionedEmojis.add(selectedEmojies.subList(i, Math.min(i + 10, selectedEmojies.size())));
        }


        model.addAttribute("emojies", partitionedEmojis);
        model.addAttribute("selectedCategory", category);
        model.addAttribute("query", query);

        return "emojies";
    }
}
