package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Servito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("=== SIMPLE ATM MENU ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.println("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                // Check Balance
                System.out.println("Your current balance is: " + balance);
                break;

            case 2:
                // Deposit
                System.out.println("Enter amount to deposit: ");
                depositAmount = input.nextDouble();

                // Nested if for validation
                if (depositAmount > 0) {
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Deposit successful. ");
                        System.out.printf("New Balance: " + balance);
                    }
                } else {
                    System.out.println("Invalid amount. Deposit must be greater than zero.");
                }
                break;

            case 3:
                // Withdraw
                System.out.println("Enter amount to withdraw: ");
                withdrawAmount = input.nextDouble();

                // Nested if statements for validation
                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                        System.out.printf("New Balance: " , balance);
                    } else {
                        System.out.println("Insufficient balance.");
                        System.out.printf("Your current balance is: " + balance);
                    }
                } else {
                    System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                }
                break;

            case 4:
                // Exit
                System.out.println("Thank you for using the Simple ATM. Goodbye!");
        }
        input.close();
    }
}
