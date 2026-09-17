package com.joysistvi.stage3.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorGame {

    // 3 dice
    public static void main(String[] args) {
        System.out.println("* Color Game *");
        List<String> dice = new ArrayList<>();

        dice.add("Blue"); // 0
        dice.add("Red");
        dice.add("Pink");
        dice.add(1, "Yellow");
        dice.add(2, "White");
        dice.add("Green");




        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println("Dice " + (i + 1) + ": " + dice.get(0));
        }


//        List<String> dice2 = new ArrayList<>();
//        dice2.addAll(dice);
//
//        Collections.shuffle(dice);
//        System.out.println("Dice 2: " + dice2.get(0));
//
//        List<String> dice3 = new ArrayList<>(dice2);
//        Collections.shuffle(dice3);
//        System.out.println("Dice 3: " + dice3.get(0));
    }
}

/*
        if(colors.contains("Blue")) {
            System.out.println("Add blue color");
        }

        // Sorting
        System.out.println("Before Sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);
 */

