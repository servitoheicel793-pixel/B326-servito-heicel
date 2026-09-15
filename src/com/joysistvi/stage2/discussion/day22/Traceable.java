package com.joysistvi.stage2.discussion.day22;

public interface Traceable {

    public abstract String generateTransactionId();
    public abstract void logTransaction(String transactionId);
}
