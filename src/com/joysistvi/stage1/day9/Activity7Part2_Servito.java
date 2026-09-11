package com.joysistvi.stage1.day9;

public class Activity7Part2_Servito {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            System.out.println("/nMultiplication Table of " + number);

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
