package com.emojitexttools.emojitexttools.service;

import com.emojitexttools.emojitexttools.model.Symbol;

import java.util.List;

public interface SymbolService {
    List<Symbol> findByCategory(String category);
    List<Symbol> findByName(String name);
    List<Symbol> findAll();
}
