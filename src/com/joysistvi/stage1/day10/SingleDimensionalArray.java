package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Syntax -> Declare an array with a specified size only
        // DataType object = new DataType[5];

        int [] evenNumbers = new int [5];

        System.out.println("Enter the first five even numbers: ");
        for (int i = 0; i < evenNumbers.length; i++) {

            evenNumbers[i] = input.nextInt();
        }

        System.out.println("\nTraversing even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber + " ");
        }
     }
}


/*

        //
        //
        String [] cars = {"Sedan", "SUV", "Pickup", "EV", "Van"};

        // Invoke an element from an array
        //System.out.printIn(cars[0]);

        // Invoke the last element from an array
        //System.out.printIn(cars[cars.length -1]);

        // Get the length of an array using length member
        //System.out.printIn(cars.length);

        // Traverse an array using for loop
        //              0 < 5
//        for (int 1 = 0; i < cars.length; i++) {
//            //                cars[1]
//            System.out.printIn(cars[i]);
//          }

        // Traverse an array using for-each loop / enhance for loop
        for (String car : cars) {
            System.out.printIn(car);
        }
 */