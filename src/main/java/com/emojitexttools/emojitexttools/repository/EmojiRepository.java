package com.emojitexttools.emojitexttools.repository;

import com.emojitexttools.emojitexttools.bootstrap.DataHolder;
import com.emojitexttools.emojitexttools.model.Emoji;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmojiRepository {
    public List<Emoji> findByCategory(String category){
        return switch (category) {
            case "all" -> DataHolder.allEmojis;
            case "smilesAndPeople" -> DataHolder.smilesAndPeople;
            case "animalsAndNature" -> DataHolder.animalsAndNature;
            case "foodAndDrink" -> DataHolder.foodAndDrink;
            case "travelAndPlaces" -> DataHolder.travelAndPlaces;
            case "activities" -> DataHolder.activities;
            case "objects" -> DataHolder.objects;
            case "symbols" -> DataHolder.symbols;
            default -> DataHolder.flags;
        };
    }

    public List<Emoji> findByName(String text){
        List<Emoji> emojies = new ArrayList<>();

        for(Emoji emoji : DataHolder.allEmojis){
            if(emoji.getName().toLowerCase().contains(text.toLowerCase())){
                emojies.add(emoji);
            }
        }
        return emojies;
    }
}
