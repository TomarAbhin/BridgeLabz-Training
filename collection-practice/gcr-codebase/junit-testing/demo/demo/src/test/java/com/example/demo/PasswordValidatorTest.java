package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PasswordValidatorTest {
    PasswordValidator password = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(password.validatePassword("Strong123"));
    }

    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            password.validatePassword("Ab1");
        });
    }

    @Test
    void testNoUppercase() {
        assertThrows(IllegalArgumentException.class, () -> {
            password.validatePassword("password1");
        });
    }

    @Test
    void testNoDigit() {
        assertThrows(IllegalArgumentException.class, () -> {
            password.validatePassword("Password");
        });
    }

    @Test
    void testNullPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            password.validatePassword(null);
        });
    }
}
