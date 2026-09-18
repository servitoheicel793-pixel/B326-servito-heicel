package com.joysistvi.stage3.day26;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

    public static void main(String[] args) {
        // Set doesn't contain duplicate element
        // Instantiating HashSet
        Set<String> names = new HashSet<>();

        names.add("Winter");
        names.add("Summer");
        names.add("Spring");
        names.add("Autumn");
        names.add("Winter");

        //names.clear();

        if (names.isEmpty()) {
            System.out.println("Exciting...");
        }

        names.forEach(System.out::println);
    }
}
