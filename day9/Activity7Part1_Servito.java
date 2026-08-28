package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7Part1_Servito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the multiplication you want to display: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        input.close();
    }
}
