package com.emojitexttools.emojitexttools.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

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

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {return category;}

    public void setCategory(String category) {
        this.category = category;
    }
}
