package com.aurionpro.loan.dto;

public class PaymentRequest {
    private int amount;  // Amount in cents, e.g. 5000 for $50

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
