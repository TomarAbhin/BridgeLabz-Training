package com.example.demo;

public class PasswordValidator {
    //validate the password strength
    public boolean validatePassword(String password) {
        //check for length
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password too short");
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        //loop through each character manually
        for (int i=0;i<password.length();i++) {
            char ch=password.charAt(i);

            //check uppercase letter
            if (ch>='A'&&ch<='Z') {
                hasUppercase = true;
            }
            //check digit
            if (ch>='0'&&ch<='9') {
                hasDigit = true;
            }
        }
        //final validation
        if (!hasUppercase || !hasDigit) {
            throw new IllegalArgumentException(
                "Password must contain at least one uppercase letter and one digit");
        }

        return true;
    }
}
