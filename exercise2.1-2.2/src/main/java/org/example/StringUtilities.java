package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a string processor with two methods: one that checks if a string is palindrome, while the other splits a
 * comma-separated string into a list of strings.
 */
public class StringUtilities {

    /**
     * Checks whether a string is palindrome.
     *
     * @param s the string to check
     * @return {@code true} if {@code s} is a palindrome. Otherwise, it is {@code false}
     */
    public boolean isPalindrome(String s) {

        String reversedString = new StringBuilder(s).reverse().toString();

        return s.equals(reversedString);
    }


    /**
     * Splits a comma-separated string into a list of strings.
     *
     * @param s the comma-separated string to split
     * @return list of strings based on {@code s}
     */
    public List<String> splitCommaSeparatedLine(String s) {

        String[] stringsArray = s.split("\\s*,\\s*");


        List<String> stringsList = Arrays.asList(stringsArray);

        return stringsList;

    }
}