package com.payment.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// ADD THIS IMPORT (Adjust if your package name is different)
import com.payment.PaymentProcessor; 

public class PaymentProcessorTest {
    PaymentProcessor processor = new PaymentProcessor();

    @Test
    void testSuccessfulPayment() {
        // Ensure the method name matches (is it 'process' or 'processPayment'?)
        assertTrue(processor.process(100.0, "1234567890123456"));
    }

    @Test
    void testInvalidAmount() {
        assertFalse(processor.process(-10.0, "1234567890123456"));
    }

    @Test
    void testInvalidCard() {
        assertFalse(processor.process(100.0, "12345"));
    }
}