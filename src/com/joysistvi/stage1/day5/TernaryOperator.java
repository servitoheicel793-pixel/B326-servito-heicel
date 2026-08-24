package com.joysistvi.stage1.day5;

public class TernaryOperator {

    public static void main(String[] args) {
        // syntax
        // (condition) ? true block : false block;

        // Program that identify if a number is positive or negative
        int num = -10;

        String numberType = (num > 0) ? "Positive" : "Negative";
        //System.out.println(numberType + "Number");

        // Program that identifies if the number is odd or even
        int num2 = 201;
        String numberCategory = num2 % 2 == 0 ? "Even" : "Odd";
        System.out.println(numberCategory + "Number");
    }
}
