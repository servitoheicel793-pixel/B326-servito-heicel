package com.joysistvi.stage2.day22;


public class CreditCardPayment extends Payment implements Refundable, Traceable {

    double cashAdvance;

    public CreditCardPayment(double balance) {
        super(balance);
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using CreditCard!");
    }

    @Override
    public String getPaymentType() {
        return "Credit Card Payment";
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + "back to Credit Card Statement");
    }

    @Override
    public String generateTransactionId() {
        return "CC-" + System.currentTimeMillis();
    }

    @Override
    public void logTransaction(String transactionId) {
        System.out.println("Transaction logged: " + transactionId);
    }

}
