package com.emojitexttools.emojitexttools.repository;

import com.emojitexttools.emojitexttools.model.Symbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymbolRepository extends JpaRepository<Symbol, Long> {
    List<Symbol> findByCategory(String category);
    List<Symbol> findByNameContainingIgnoreCase(String text);
}
