package com.joysistvi.stage1.day13;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();


        System.out.println(sum(10, 20));

    }

    // parameters and arguments

    public static int sum(int a, int b) {

        return Math.max(a,b);

    }

}
