package com.joysistvi.stage1.day9;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            //              1 <= 2
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }

            System.out.println(); // new line
        }
    }
}

// Whenever an outer loop executes, inner loop executes completely


/*
//              3 <= 3
        for (int i = 1; i <= 3; i++) { // outer loop
            System.out.println(i);
            //              4 <= 3
            for (int j = 1; j <= 3; j++) { // inner for loop
                System.out.println("\t" + j);
            }
        }
 */