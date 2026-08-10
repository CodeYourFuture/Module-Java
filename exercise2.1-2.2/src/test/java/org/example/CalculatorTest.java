package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies whether the methods from {@code Calculator} class perform their expected arithmetic operations.
 */
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator =  new Calculator();
    }

    /**
     * Tests whether the {@code add()} method calculates the sum of two integers.
     */
    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "Addition of 2 values should equal the expected value");
    }

    /**
     * Tests whether the {@code divide()} method divides two integers, as long as the divisor is not zero.
     */
    @Test
    void testDivide() {
        assertEquals(20, calculator.divide(100, 5), "dividing value1 by value2 should equal the expected value");
    }

    /**
     * Tests whether the {@code divide()} method throws {@code IllegalArgumentException} when the divisor is zero.
     */
    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(50, 0), "dividing by 0 should throw an exception");
    }

    /**
     * Tests whether the {@code square()} method calculates the square of an integer.
     */
    @Test
    @DisplayName("Method returns the square of an integer")
    void testSquare() {
        assertEquals(64, calculator.square(7), "when a value is squared it should equal to the expected result");
    }

    /**
     * Tests whether the {@code squareRoot()} method calculates the square root of a non-negative integer.
     */
    @Test
    @DisplayName("Method returns the square root of an integer")
    void testSquareRoot() {
        assertEquals(5, calculator.squareRoot(25), "The square root of a value should equal to the expected result");
        assertEquals(1.73205, calculator.squareRoot(3), 0.00001, "The square root of a value should equal to the expected result");
    }

    /**
     * Tests whether the {@code squareRoot()} method throws {@code IllegalArgumentException} for negative integers.
     */
    @Test
    @DisplayName("Square root method throws an exception for negative values")
    void testSquareRootForNegativeValues() {
        assertThrows(IllegalArgumentException.class,()-> calculator.squareRoot(-4), "Square root for negative values should throw an exception");
    }
}