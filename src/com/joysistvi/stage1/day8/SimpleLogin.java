package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "heicy@gmail.com";
        String password = "heicy123";

        System.out.println("Enter email: ");
        String loginEmail = scanner.nextLine();

        System.out.println("Enter password: ");
        String loginPass = scanner.nextLine();

        if (loginEmail.equals(email) && loginPass.equals(password)) {
            System.out.println("Login Successfully!");
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }
}
