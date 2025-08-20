package com.emojitexttools.emojitexttools.repository;

import com.emojitexttools.emojitexttools.bootstrap.DataHolder;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmojiRepository {
    public List<String> findAll(){
        return DataHolder.allEmojis;
    }

    public List<String> findByCategory(String category){
        if(category.equals("all")){
            return DataHolder.allEmojis;
        }
        else if(category.equals("smilesAndPeople")){
            return DataHolder.smilesAndPeople;
        }
        else if(category.equals("animalsAndNature")){
            return DataHolder.animalsAndNature;
        }
        else if(category.equals("foodAndDrink")){
            return DataHolder.foodAndDrink;
        }
        else if(category.equals("travelAndPlaces")){
            return DataHolder.travelAndPlaces;
        }
        else if(category.equals("activities")){
            return DataHolder.activities;
        }
        else if(category.equals("objects")){
            return DataHolder.objects;
        }
        else if(category.equals("symbols")){
            return DataHolder.symbols;
        }
        else{
            return DataHolder.flags;
        }
    }
}
