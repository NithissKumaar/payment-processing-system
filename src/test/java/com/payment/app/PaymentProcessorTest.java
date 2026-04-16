package com.payment.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaymentProcessorTest {
    PaymentProcessor processor = new PaymentProcessor();

    @Test
    void testSuccessfulPayment() {
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