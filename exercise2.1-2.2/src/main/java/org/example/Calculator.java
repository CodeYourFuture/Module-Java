package org.example;

/**
 * Represents a calculator that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer to add to
     * @param b the second integer to add
     * @return the sum of {@code a} and {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }


    /**
     * Subtracts one integer from another.
     *
     * @param a the integer to subtract from
     * @param b the integer to subtract
     * @return the subtraction of {@code b} from {@code a}
     */
    public int subtract(int a, int b) {
        return a - b;
    }


    /**
     * Calculates the multiplication of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the multiplication of {@code a} and {@code b}
     */
    public int multiply(int a, int b) {
        return a * b;
    }


    /**
     * Divides two integers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing {@code a} by {@code b}
     * @throws IllegalArgumentException if {@code b} is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
     * Calculates the square of an integer.
     *
     * @param a the integer to square
     * @return the squared value of {@code a}
     */
    public int square(int a) {
        return a * a;
    }


    /**
     * Calculates the square root of a non-negative integer.
     *
     * @param a the non-negative integer to square root
     * @return the square root of {@code a}
     * @throws IllegalArgumentException if {@code a} is below zero
     */
    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative values is not allowed");
        }
        return Math.sqrt(a);
    }
}