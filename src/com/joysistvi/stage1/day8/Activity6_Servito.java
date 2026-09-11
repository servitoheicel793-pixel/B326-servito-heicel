package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Servito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = "heicy@gmail.com";
        String password = "heicy123";

        int maxAttempts = 3;

        boolean isLoggedIn = false;

        System.out.println("=== Log In ===");
        //                      1 <= 3
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + " of " + maxAttempts);

            System.out.println("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.println("Enter password: ");
            String loginPass = scanner.nextLine();

            boolean emailCorrect = loginEmail.equals(email);
            boolean passCorrect = loginEmail.equals(password);

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("\nLogin Successfully!");
                isLoggedIn = true;

                break;

            } else if (!emailCorrect && !passCorrect) {
                System.out.println("\nInvalid Username or Password!");

            } else if (!emailCorrect) {
                System.out.println("\nInvalid email! Try again.");
            } else {
                System.out.println("\nInvalid password! Try again.");
            }
        }

        if (!isLoggedIn) {
            System.out.println("\nAccount locked. Too many failed attempts! ");
        }



        // Invalid Username
        // Invalid Password

    }
}
