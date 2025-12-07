package com.emojitexttools.emojitexttools.web;

import com.emojitexttools.emojitexttools.model.Symbol;
import com.emojitexttools.emojitexttools.service.SymbolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SymbolsController {
    private final SymbolService symbolService;

    public SymbolsController(SymbolService symbolService) {
        this.symbolService = symbolService;
    }

    @GetMapping("/symbols")
    public String getSymbols(
            @RequestParam(defaultValue = "all") String category,
            @RequestParam(value = "query", required = false) String query,
            Model model) {

        List<Symbol> selectedSymbols;

        if (query != null && !query.trim().isEmpty()) {
            selectedSymbols = symbolService.findByName(query);
        } else if(category.equals("all")) {
            selectedSymbols = symbolService.findAll();
        }
        else {
            selectedSymbols = symbolService.findByCategory(category);
        }

        List<List<Symbol>> partitionedSymbols = new ArrayList<>();
        for (int i = 0; i < selectedSymbols.size(); i += 10) {
            partitionedSymbols.add(selectedSymbols.subList(i, Math.min(i + 10, selectedSymbols.size())));
        }

        model.addAttribute("symbols", partitionedSymbols);
        model.addAttribute("selectedCategory", category);
        model.addAttribute("query", query);

        return "symbols";
    }
}
