package com.joysistvi.stage1.day4;

public class Activity2_Servito {
    public static void main(String[] args) {
        // Given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentage of each expense
        double foodPercentage = ( foodAllowance / income ) * 100;
        double transportationPercentage = ( transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityPercentage = (utilityBill / income) * 100;

        // Calculate total expenses and remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results
        System.out.printf("Income: %.2f%n", income);
        System.out.printf("Food Allowance: %.2f (%.1f%%)%n", foodAllowance, foodPercentage);
        System.out.printf("Transportation: %.2f (%.1f%%)%n", transportation, transportationPercentage);
        System.out.printf("Rent: %.2f (%.1f%%)%n", rent, rentPercentage);
        System.out.printf("Utility Bill: %.2f (%.1f%%)%n", utilityBill, utilityPercentage);
        System.out.printf("Total Expenses: %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance: %.2f%n", remainingBalance);
    }
}
