package com.emojitexttools.emojitexttools.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextGeneratorController {

    @GetMapping("/textGenerator")
    public String getTextGenerator() {
        return "textGenerator";
    }
}
