package sprint3.excercises.exercise3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTestNew {

    private StringUtilitiesNew stringUtilities;

    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilitiesNew();
    }

    @ParameterizedTest(name = "\"{0}\" should return {1}")
    @CsvSource({
            "level, true",
            "racecar, true",a
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