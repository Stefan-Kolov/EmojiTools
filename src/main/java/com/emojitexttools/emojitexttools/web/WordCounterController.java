package com.emojitexttools.emojitexttools.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordCounterController {

    @GetMapping("/wordCounter")
    public String getWordCounter() {
        return "wordCounter";
    }
}
