import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * to test the behavior of string utilities class
 */
class StringUtilitiesTest {

    private StringUtilities stringUtilities;

    /**
     * Creates an stringutilities instance before each test
     */
    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    /**
     * To verify if isPalindrom correctly identifies both palindromic
     * of non palindromic strings.
     * @param input the string being tested
     * @param expected the expected palindrom result
     */
    @ParameterizedTest(name = "\"{0}\" should return {1}")
    @CsvSource({
            "level, true",
            "racecar, true",
            "hello, false",
            "a, true",
            "ab, false"
    })
    void shouldCorrectlyIdentifyPalindromes(
            String input,
            boolean expected
    ) {
        assertEquals(
                expected,
                stringUtilities.isPalindrome(input)
        );
    }

    /**
     * Verifies that a comma-separated string is split into the expected list of values.
     */
    @Test
    void shouldSplitCommaSeparatedLine() {

        List<String> result =
                stringUtilities.splitCommaSeparatedLine(
                        "apple,banana,orange"
                );

        assertEquals(
                List.of("apple", "banana", "orange"),
                result
        );
    }
}