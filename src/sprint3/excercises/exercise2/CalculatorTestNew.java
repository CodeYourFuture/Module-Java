package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestNew {

    private CalculatorNew calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorNew();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }

    @Test
    void testSquare() {
        assertEquals(16, calculator.square(4));
        assertEquals(0, calculator.square(0));
        assertEquals(9, calculator.square(-3));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9));
        assertEquals(1.732, calculator.squareRoot(3), 0.001);
    }

    @Test
    void testSquareRootNegativeThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.squareRoot(-1)
        );
    }
}