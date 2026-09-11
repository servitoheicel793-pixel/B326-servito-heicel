package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Servito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare an array of 5 integers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        // Ask the user to input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display all numbers entered
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Compute the sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Compute the average
        double average = (double) sum / numbers.length;

        // Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Display results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
    }
}
