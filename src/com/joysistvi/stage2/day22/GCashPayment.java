package com.joysistvi.stage2.day22;


public class GCashPayment extends Payment implements Refundable, Traceable {

    double savings;

    public GCashPayment(double balance, double savings) {
        super (balance);
        this.savings = savings;
    }


    // Polymorphism: method overriding
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using GCash!");

    }

    // non-abstract method
    @Override
    public String getPaymentType() {
        return "Gcash Payment";
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + "back to GCash Wallet");
    }

    @Override
    public String generateTransactionId() {
        return "GC-" + System.currentTimeMillis();
    }

    @Override
    public void logTransaction(String transactionId) {
        System.out.println("Transaction logged: " + transactionId);
    }

}
