package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator =  new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "Addition of 2 values should equal the expected value");
    }

    @Test
    void testDivide() {
        assertEquals(20, calculator.divide(100, 5), "dividing value1 by value2 should equal the expected value");
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(50, 0), "dividing by 0 should throw an exception");
    }

    @Test
    @DisplayName("Method returns the square of an integer")
    void testSquare() {
        assertEquals(64, calculator.square(7), "when a value is squared it should equal to the expected result");
    }

    @Test
    @DisplayName("Method returns the square root of an integer")
    void testSquareRoot() {
        assertEquals(5, calculator.squareRoot(25), "The square root of a value should equal to the expected result");
        assertEquals(1.73205, calculator.squareRoot(3), 0.00001, "The square root of a value should equal to the expected result");
    }

    @Test
    @DisplayName("Square root method throws an exception for negative values")
    void testSquareRootForNegativeValues() {
        assertThrows(IllegalArgumentException.class,()-> calculator.squareRoot(-4), "Square root for negative values should throw an exception");
    }
}