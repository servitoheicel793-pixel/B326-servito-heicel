package com.joysistvi.stage2.day22;



public class Main {

    public static void main(String[] args) {
        // Single Inheritance: GCashPayment extends Payment
        GCashPayment gcashPayment = new GCashPayment(1000, 500);

        gcashPayment.printReceipt(250);

        gcashPayment.refund(500);
        String txnId = gcashPayment.generateTransactionId();
        gcashPayment.logTransaction(txnId);

        //Multiple Inheritance
        // #1 - Refundable
//        if (gcashPayment instanceof Refundable) {
//            Refundable r = (Refundable) gcashPayment;
//            r.refund(100);
//        }
//
//        // #2 - Traceable
//        if (gcashPayment instanceof Traceable) {
//            Traceable t = (Traceable) gcashPayment;
//            String txnId = t.generateTransactionId();
//            t.logTransaction(txnId);
//        }

        System.out.println("--------------------------------");


        Payment creditCard = new CreditCardPayment(1000);

        creditCard.printReceipt(250);

        //Multiple Inheritance
        // #1 - Refundable
        if (creditCard instanceof Refundable) {
            Refundable r = (Refundable) creditCard;
            r.refund(100);
        }

        // #2 - Traceable
//        if (creditCard instanceof Traceable) {
//            Traceable t = (Traceable) creditCard;
//            String txnId = t.generateTransactionId();
//            t.logTransaction(txnId);
//        }

        System.out.println("--------------------------------");


        Payment cashPayment = new CashPayment(1000);

        creditCard.printReceipt(250);

        //Multiple Inheritance
        // #1 - Refundable
        if (cashPayment instanceof Refundable) {
            Refundable r = (Refundable) cashPayment;
            r.refund(100);
        }

        // #2 - Traceable
//        if (cashPayment instanceof Traceable) {
//            Traceable t = (Traceable) cashPayment;
//            String txnId = t.generateTransactionId();
//            t.logTransaction(txnId);
//        }

        System.out.println("--------------------------------");
    }
}

/*
        CashPayment cashPayment = new CashPayment(5000);
        GCashPayment gCashPayment = new GCashPayment(10000, 1000);
        CreditCardPayment creditCardPayment = new CreditCardPayment(2000);
        //cashPayment.pay(2500);


        cashPayment.printReceipt(2000);
        gCashPayment.printReceipt(3000);
        creditCardPayment.printReceipt(2000);
 */
