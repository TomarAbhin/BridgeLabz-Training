package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

    Arithmetic division = new Arithmetic();

    @Test
    void testDivideByZeroThrowsException() {

        //verify that ArithmeticException is thrown when divisor is zero
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                	division.divide(10, 0);
                });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

