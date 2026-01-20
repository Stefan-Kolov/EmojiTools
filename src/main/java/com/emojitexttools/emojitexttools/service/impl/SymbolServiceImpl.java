package com.emojitexttools.emojitexttools.service.impl;

import com.emojitexttools.emojitexttools.model.Symbol;
import com.emojitexttools.emojitexttools.repository.SymbolRepository;
import com.emojitexttools.emojitexttools.service.SymbolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymbolServiceImpl implements SymbolService {
    private final SymbolRepository symbolRepository;

    public SymbolServiceImpl(SymbolRepository symbolRepository) {
        this.symbolRepository = symbolRepository;
    }

    @Override
    public List<Symbol> findByCategory(String category) {
        return symbolRepository.findByCategory(category);
    }

    @Override
    public List<Symbol> findByName(String name) {
        return symbolRepository
                .findByNameContainingIgnoreCase(name)
                .stream()
                .distinct()
                .toList();
    }

    @Override
    public List<Symbol> findAll() {
        return symbolRepository.findAll();
    }
}
