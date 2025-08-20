package com.emojitexttools.emojitexttools.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SymbolsController {

    @GetMapping("/symbols")
    public String getSymbols() {
        return "symbols";
    }
}
