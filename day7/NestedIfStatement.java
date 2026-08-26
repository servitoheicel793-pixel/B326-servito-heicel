package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {
        // [Section] Syntax of Nested If Statement

        /*
            if () { outer if
                if () { inner if
                    if () {

                    }
                } else {
                    if () {

                    }
                }
            } else {
                if () {

                }
            }
         */

        // Age Categorizer
        /* Requirements
            Age: 0 - 2 Category: Baby
            Age: 3 - 12 Category: Child
                3 - 6 -> Preschooler
                7 - 12 -> Grade Schooler
            Age: 13 - 19 Category: Teenager
                13 - 15 -> Early Teen
                15 - 19 -> Late Teen
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Categorizer ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        if (age >= 0 && age <= 2) {
            System.out.println("Category: Baby");
        } else if (age >= 2 && age <= 12) {
            System.out.println("Category: Child");

            // inner if statement
            if (age >= 3 && age <= 6) {
                System.out.println("Preschooler");
            } else {
                System.out.println("Grade Schooler");
            }
        } else if (age >= 13 && age <= 19) {
            System.out.println("Category: Teenager");

            // inner if
            if (age >= 13 && age <= 15) {
                System.out.println("Early Teen");
            } else {
                System.out.println("Late Teen");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
