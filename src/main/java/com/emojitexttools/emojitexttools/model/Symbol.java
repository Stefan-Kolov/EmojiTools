package com.emojitexttools.emojitexttools.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
public class Symbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private String name;
    private String category;

    public Symbol(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public Symbol() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol1 = (Symbol) o;
        return Objects.equals(id, symbol1.id) && Objects.equals(symbol, symbol1.symbol) && Objects.equals(name, symbol1.name) && Objects.equals(category, symbol1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, name, category);
    }
}
