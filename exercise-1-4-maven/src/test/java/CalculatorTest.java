import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This tests the behavior of the calculator class
 */
public class CalculatorTest {
    /**
     * This test case is used to check if the add method correctly add the two positive integers
     */

    @Test
    void shouldAddTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }
}