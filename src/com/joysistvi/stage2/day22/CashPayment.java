package com.joysistvi.stage2.day22;


public class CashPayment extends Payment {

    public CashPayment(double balance) {
        super(balance);
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash Payment");
    }

    @Override
    public String getPaymentType() {
        return "Cash Payment";
    }


}
