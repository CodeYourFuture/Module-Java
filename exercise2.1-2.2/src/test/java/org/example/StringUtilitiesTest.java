package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


/**
 * Verifies that the methods of {@code StringUtilities} class perform the expected utility operations
 * on strings.
 */
public class StringUtilitiesTest {

    StringUtilities stringUtilities;

    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    /**
     * Individually tests whether the {@code isPalindrome()} method can determine whether a string is a palindrome.
     */
    @Test
    void testIsPalindrome1(){
        assertTrue(stringUtilities.isPalindrome("mom"), "this word should be palindrome");
        assertTrue(stringUtilities.isPalindrome("B"), "this word should be palindrome"); //edge case
        assertTrue(stringUtilities.isPalindrome(""), "this word should be palindrome");  // edge case
    }

    /**
     * Tests whether the {@code isPalindrome()} method can determine whether multiple strings are
     * palindromes using CSV input.
     */
    @ParameterizedTest
    @CsvSource({"RADAR", "dead", "a"})
    @DisplayName("Test if various input strings were palindrome all at once using @ParameterizedTest and @CsvSource")
    void testIsPalindrome2(String s) {
        assertTrue(stringUtilities.isPalindrome(s));
    }

    /**
     * Tests whether the {@code isPalindrome()} method can determine whether multiple strings are
     * palindromes using a method source.
     */
    @ParameterizedTest
    @MethodSource("isPalindromeData")
    @DisplayName("")
    void testIsPalindrome3(String s) {
        assertTrue(stringUtilities.isPalindrome(s));
    }

    static Stream<Arguments> isPalindromeData() {
        return Stream.of(
                Arguments.of("lol"),
                Arguments.of("mwcwm"),
                Arguments.of("hahaha")
        );
    }


    /**
     * Tests whether the {@code splitCommaSeparatedLine()} method splits a comma-separated string into a list of strings.
     */
    @Test
    void splitCommaSeparatedLine(){
        assertEquals(List.of("Jan", "Feb", "Mar", "Apr"), stringUtilities.splitCommaSeparatedLine("Jan, Feb, Mar, Apr"), "Comma-separated string should return a list of those strings");
        assertEquals(List.of("Spring - Summer - Autumn - Winter"), stringUtilities.splitCommaSeparatedLine("Spring - Summer - Autumn - Winter"), "Comma-separated string should return a list of those strings"); //edge case
        assertEquals(List.of("  ", "  ", "  ", "  "), stringUtilities.splitCommaSeparatedLine("  ,  ,  ,  "), "Comma-separated string should return a list of those strings");// edge case
    }



}
