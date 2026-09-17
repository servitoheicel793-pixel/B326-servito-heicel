package com.joysistvi.stage2.day23;

public class View {

    // Declare enum inside the class
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        // Access an element from an enum
        System.out.println(Level.HIGH);
        System.out.println(Day.MONDAY);

        // Enum in Conditional Operations
        Day day = Day.MONDAY;

        switch(day) {
            case MONDAY:
                System.out.println(Day.MONDAY);
                break;
            case TUESDAY:
                System.out.println(Day.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println(Day.WEDNESDAY);
                break;
            default:
                System.out.println("Invalid Day");
        }

        if (Day.MONDAY.equals(Day.MONDAY)) {
            System.out.println("First Day of the Week");
        }

        // Loop thru an enum
        System.out.println("\nPrinting all the days");
        for (Day d: Day.values()) {
            System.out.println(d);
        }
    }
}
