package com.joysistvi.stage2.day20;


public class Payment {

    double balance;
    double amount;


    public Payment(double balance) {
        this.balance = balance;

    }

    void pay(double amount){
        System.out.println("Processing generic of amount " + amount);
    }
}


// public protected default private