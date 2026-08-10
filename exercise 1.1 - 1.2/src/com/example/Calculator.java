package com.example;

public class Calculator {
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
            throw new IllegalArgumentException("Square root of negative values is not allowed");
        }
        return Math.sqrt(a);
    }
}

/*Q1: what should happen if squareRoot is requested for a negative number?
A1: the method should throw an exception.

Q2: how would we check the answer for squareRoot(3) ? (think accuracy required)
A2: We could add delta, accuracy tolerance to metigate the issue of sqrt for irrational numbers such as 3.

 */
