package com.payment.app;

public class PaymentProcessor {
    public boolean process(double amount, String cardNumber) {
        // Basic validation: Amount must be positive and card must be 16 digits
        if (amount <= 0 || cardNumber == null || cardNumber.length() != 16) {
            return false;
        }
        // Simulate successful processing
        return true;
    }
}