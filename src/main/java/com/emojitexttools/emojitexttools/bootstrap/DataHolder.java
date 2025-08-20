package com.emojitexttools.emojitexttools.bootstrap;

import com.emojitexttools.emojitexttools.model.Blog;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<String> allEmojis = new ArrayList<>();
    public static List<String> smilesAndPeople = new ArrayList<>();
    public static List<String> animalsAndNature = new ArrayList<>();
    public static List<String> foodAndDrink = new ArrayList<>();
    public static List<String> travelAndPlaces = new ArrayList<>();
    public static List<String> activities = new ArrayList<>();
    public static List<String> objects = new ArrayList<>();
    public static List<String> symbols = new ArrayList<>();
    public static List<String> flags = new ArrayList<>();
    public static List<Blog> blogs = new ArrayList<>();


    @PostConstruct
    public void init(){
        smilesAndPeople.add("😀");
        smilesAndPeople.add("😃");
        smilesAndPeople.add("😄");
        smilesAndPeople.add("😁");
        smilesAndPeople.add("😆");
        smilesAndPeople.add("😅");
        smilesAndPeople.add("😂");
        smilesAndPeople.add("🤣");
        smilesAndPeople.add("😊");
        smilesAndPeople.add("😇");
        smilesAndPeople.add("🙂");
        smilesAndPeople.add("🙃");
        smilesAndPeople.add("😉");
        smilesAndPeople.add("😌");
        smilesAndPeople.add("😍");
        smilesAndPeople.add("🥰");
        smilesAndPeople.add("😘");
        smilesAndPeople.add("😗");
        smilesAndPeople.add("😙");
        smilesAndPeople.add("😚");
        smilesAndPeople.add("😋");
        smilesAndPeople.add("😛");
        smilesAndPeople.add("😝");
        smilesAndPeople.add("😜");
        smilesAndPeople.add("🤪");
        smilesAndPeople.add("🤨");
        smilesAndPeople.add("🧐");
        smilesAndPeople.add("🤓");
        smilesAndPeople.add("😎");
        smilesAndPeople.add("🥸");
        smilesAndPeople.add("🤩");
        smilesAndPeople.add("🥳");
        smilesAndPeople.add("😏");
        smilesAndPeople.add("😒");
        smilesAndPeople.add("😞");
        smilesAndPeople.add("😔");
        smilesAndPeople.add("😟");
        smilesAndPeople.add("😕");
        smilesAndPeople.add("🙁");
        smilesAndPeople.add("☹️");
        smilesAndPeople.add("😣");
        smilesAndPeople.add("😖");
        smilesAndPeople.add("😫");
        smilesAndPeople.add("😩");
        smilesAndPeople.add("🥺");
        smilesAndPeople.add("😢");
        smilesAndPeople.add("😭");
        smilesAndPeople.add("😤");
        smilesAndPeople.add("😠");
        smilesAndPeople.add("😡");
        smilesAndPeople.add("🤬");
        smilesAndPeople.add("🤯");
        smilesAndPeople.add("😳");
        smilesAndPeople.add("🥵");
        smilesAndPeople.add("🥶");
        smilesAndPeople.add("😱");
        smilesAndPeople.add("😨");
        smilesAndPeople.add("😰");
        smilesAndPeople.add("😥");
        smilesAndPeople.add("😓");
        smilesAndPeople.add("🤗");
        smilesAndPeople.add("🤔");
        smilesAndPeople.add("🤭");
        smilesAndPeople.add("🤫");
        smilesAndPeople.add("🤥");
        smilesAndPeople.add("😶");
        smilesAndPeople.add("😐");
        smilesAndPeople.add("😑");
        smilesAndPeople.add("😬");
        smilesAndPeople.add("🙄");
        smilesAndPeople.add("😯");
        smilesAndPeople.add("😦");
        smilesAndPeople.add("😧");
        smilesAndPeople.add("😮");
        smilesAndPeople.add("😲");
        smilesAndPeople.add("🥱");
        smilesAndPeople.add("😴");
        smilesAndPeople.add("🤤");
        smilesAndPeople.add("😪");
        smilesAndPeople.add("😵");
        smilesAndPeople.add("🤐");
        smilesAndPeople.add("🥴");
        smilesAndPeople.add("🤢");
        smilesAndPeople.add("🤮");
        smilesAndPeople.add("🤧");
        smilesAndPeople.add("😷");
        smilesAndPeople.add("🤒");
        smilesAndPeople.add("🤕");

        // Animals
        animalsAndNature.add("🐶");
        animalsAndNature.add("🐱");
        animalsAndNature.add("🐭");
        animalsAndNature.add("🐹");
        animalsAndNature.add("🐰");
        animalsAndNature.add("🦊");
        animalsAndNature.add("🐻");
        animalsAndNature.add("🐼");
        animalsAndNature.add("🐨");
        animalsAndNature.add("🐯");

        // Food & Drink
        foodAndDrink.add("🍏");
        foodAndDrink.add("🍎");
        foodAndDrink.add("🍐");
        foodAndDrink.add("🍊");
        foodAndDrink.add("🍋");
        foodAndDrink.add("🍌");
        foodAndDrink.add("🍉");
        foodAndDrink.add("🍇");
        foodAndDrink.add("🍓");
        foodAndDrink.add("🫐");

        // Travel & Places
        travelAndPlaces.add("🚗");
        travelAndPlaces.add("🚕");
        travelAndPlaces.add("🚙");
        travelAndPlaces.add("🚌");
        travelAndPlaces.add("🚎");
        travelAndPlaces.add("🏎️");
        travelAndPlaces.add("🚓");
        travelAndPlaces.add("🚑");
        travelAndPlaces.add("🚒");
        travelAndPlaces.add("🚐");

        // Activities
        activities.add("⚽");
        activities.add("🏀");
        activities.add("🏈");
        activities.add("⚾");
        activities.add("🥎");
        activities.add("🎾");
        activities.add("🏐");
        activities.add("🏉");
        activities.add("🎱");
        activities.add("🏓");

        // Objects
        objects.add("⌚");
        objects.add("📱");
        objects.add("💻");
        objects.add("🖥️");
        objects.add("🖨️");
        objects.add("⌨️");
        objects.add("🖱️");
        objects.add("🖲️");
        objects.add("💽");
        objects.add("💾");

        // Symbols
        symbols.add("❤️");
        symbols.add("💛");
        symbols.add("💚");
        symbols.add("💙");
        symbols.add("💜");
        symbols.add("🖤");
        symbols.add("💔");
        symbols.add("❣️");
        symbols.add("💕");
        symbols.add("💞");

        // Flags
        flags.add("🏳️");
        flags.add("🏴");
        flags.add("🏁");
        flags.add("🚩");
        flags.add("🏳️‍🌈");
        flags.add("🏳️‍⚧️");
        flags.add("🇺🇳");
        flags.add("🇦🇫");
        flags.add("🇦🇱");
        flags.add("🇩🇿");

        blogs.add(new Blog("Title","Description"));
        blogs.add(new Blog("Title2","Description2"));
    }

    @PostConstruct
    public List<String> getAllEmojies(){
        allEmojis.addAll(smilesAndPeople);
        allEmojis.addAll(animalsAndNature);
        allEmojis.addAll(foodAndDrink);
        allEmojis.addAll(travelAndPlaces);
        allEmojis.addAll(activities);
        allEmojis.addAll(objects);
        allEmojis.addAll(symbols);
        allEmojis.addAll(flags);
        return allEmojis;
    }
}
