package com.payment.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.payment.PaymentProcessor; 

public class PaymentProcessorTest {
    PaymentProcessor processor = new PaymentProcessor();

    @Test
    void testSuccessfulPayment() {
        // Change 'process' to 'processPayment'
        assertTrue(processor.processPayment(100.0, "1234567890123456"));
    }

    @Test
    void testInvalidAmount() {
        // Change 'process' to 'processPayment'
        assertFalse(processor.processPayment(-10.0, "1234567890123456"));
    }

    @Test
    void testInvalidCard() {
        // Change 'process' to 'processPayment'
        assertFalse(processor.processPayment(100.0, "12345"));
    }
}