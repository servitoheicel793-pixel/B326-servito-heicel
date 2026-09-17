package com.joysistvi.stage2.day23;

public class ProceduralProgramming {

    // Procedural Programming Approach
    /*
        This programming style relies on procedure or routines(methods/function) to operate on date,
        where data and behavior are handled separately.
     */

    // Example: We want to create a variable(s) that will describe a pet.
    // name, ageInMonths, classification, gender, sound, breed
    static String petAName = "Peanut";
    static int petAgeInmonths = 5;
    static String petClassification = "Dog";
    static String petGender = "Male";
    static String petSound = "Bark bark";
    static String petBreed = "Shih Tzu";

    public static void describePet() {
        System.out.println(petAName + " is a " + petGender + petClassification + " who is " + petAgeInmonths + " years of age in months and breed is " + petBreed);
    }

    public static void makeSound() {
        System.out.println(petAName + " says " + petSound + "!");
    }

    public static void main(String[] args) {
        //makeSound();
        //describePet();
        printName();
    }

    // Limitations of Procedural Approach:
    /*
        The entity is not represented as a single unit, but rather a collection of separated variables (eg. multiples per pet)
        No data protection. Any part of the program can be modified or change the variables directly

     */

    // To address this issue, we can use encapsulation which allows us to bundles the data and methods that operates on the data within a single unit (class) and restrict access to some of the object's component.

    public static void printName() {
        petAName = "Choco";
        System.out.println(petAName);
    }

    // Employee

    // Payment

}
