package com.joysistvi.stage1.day14;

import java.util.Scanner;

// parameters & arguments
// SOC Principle
// Code Reusability
// Avoid Code Duplication
public class LoadRegistration {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        validateUssdCode();
        mainMenu();
    }

    public static void validateUssdCode() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.println("Enter USSD Code");
        String ussdCode = scanner.nextLine().trim();

        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code. Exciting...");
            System.exit(0); // Exit JVM
        }

        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("*** Load Registration ***");
        System.out.println("   [1] Unli Text");
        System.out.println("   [2] Unli Call");
        System.out.println("   [3] Go Surf");
        System.out.println("   [4] Check Balance");
        System.out.println("   [5] Borrow Load");
        System.out.println("   [6] Exit");

        System.out.print("Enter choice: ");
        int mainMenuChoice = scanner.nextInt();

        switch (mainMenuChoice) {
            case 1:

        }
    }

    public static void unliTextPromo() {
        System.out.println("*** Enjoy Unli Text ***");
        System.out.println("   [1] 1 Day for P10");
        System.out.println("   [2] 3 Days for P30");
        System.out.println("   [3] 5 Days for P50");
        System.out.println("   [4] Back");
        System.out.println("   [0] Exit");
        System.out.println("Enter choice: ");
        int unliTextChoice = scanner.nextInt();

        switch (unliTextChoice) {
            case 1:
                subscriptionConfirmation(1, 10, 5);
                break;
            case 2:
                subscriptionConfirmation(3, 30, 10);
                break;

            case 3:
                subscriptionConfirmation(5, 50, 15);
                break;

        }
    }


    // parameters and arguments
    public static void subscriptionConfirmation (int days, int price, int gb) {
        System.out.println("-> Get " + days + " Unli Text Promo for only P " + price + " and 10gb free");

        System.out.println("   [1] Subscribe");
        System.out.println("   [2] Back");
        System.out.println("   [3] Exit");
        System.out.println("Enter choice: ");
    }
}
