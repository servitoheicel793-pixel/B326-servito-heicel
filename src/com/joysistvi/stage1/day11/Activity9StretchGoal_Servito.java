package com.joysistvi.stage1.day11;

public class Activity9StretchGoal_Servito {

    public static void main(String[] args) {
        String country = "Philippines";

        // Display first and last character
        char first = country.charAt(0);
        char last = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);

        // Count P/p
        int pCount = 0;

        // Count vowels
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = country.charAt(i);

            // Count P or p
            if (letter == 'P' || letter == 'p') {
                pCount++;
            }

            // Count vowels
            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u' ||
                    letter == 'A' || letter == 'E' ||
                    letter == 'I' || letter == 'O' ||
                    letter == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Total number of vowels: " + vowelCount);
    }
}
