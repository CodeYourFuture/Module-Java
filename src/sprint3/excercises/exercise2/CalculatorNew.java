package com.example;

public class CalculatorNew {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return Math.sqrt(a);
    }
}