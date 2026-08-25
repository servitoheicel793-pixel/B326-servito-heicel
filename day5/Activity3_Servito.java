package com.joysistvi.stage1.day5;

public class Activity3_Servito {
    public static void main(String[] args) {

        int age = 18;
        boolean hasValidId = true;

        String allowed = age >= 18 && hasValidId ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + allowed);
        // Allowed to enter the event : Yes / No

        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean noClasses = isWeekend || isHoliday;

        System.out.print("Are there no classes today? ");
        System.out.println("Yes, no classes. ");

        int score = 85;

        String result = score >= 75 ? "Passed" : "Failed";
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);


        int num = 10;
        int num2 = 25;

        int largerNumber = num >= num2 ? num : num2;
        System.out.println("Number 1: " + num);
        System.out.println("Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);










    }
}
