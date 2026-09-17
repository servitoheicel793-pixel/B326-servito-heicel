package com.joysistvi.stage2.day22;

// Abstract Class
public abstract class Payment {

    double balance;
    double amount;


    public Payment(double balance) {
        this.balance = balance;

    }

    // abstract method
    public abstract void pay(double amount);

    // abstract method
    public abstract String getPaymentType();


    // non-abstract method / concrete method
    // shared by all subclasses
    public void printReceipt(double amount) {
        pay(amount);
        System.out.println("Payment Type: " + getPaymentType());
        System.out.println("------------------------------------");
    }
}

// non-access modifiers: final, static, abstract

// public protected default private