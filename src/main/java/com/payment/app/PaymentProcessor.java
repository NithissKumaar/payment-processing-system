package com.payment; // Must match the <mainClass> in pom.xml

public class PaymentProcessor {
    public static void main(String[] args) {
        System.out.println("--- Payment System Started ---");
        
        // Example logic to prove it works
        PaymentProcessor proc = new PaymentProcessor();
        boolean result = proc.processPayment(100.0, "1234567812345678");
        System.out.println("Initial Test Payment Result: " + result);

        // CRITICAL: Keep the process alive so Kubernetes doesn't restart it
        try {
            System.out.println("System is idling... Press Ctrl+C to stop.");
            Thread.currentThread().join(); 
        } catch (InterruptedException e) {
            System.out.println("System interrupted.");
        }
    }

    public boolean processPayment(double amount, String cardNumber) {
        return amount > 0 && cardNumber.length() == 16;
    }
}