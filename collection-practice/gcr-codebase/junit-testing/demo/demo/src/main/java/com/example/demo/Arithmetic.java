package com.example.demo;

public class Arithmetic {

    //divides a by b
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");  //throws ArithmeticException if b is zero
        }
        return a / b;
    }
}
