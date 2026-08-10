package org.example;

import java.util.Arrays;
import java.util.List;

public class StringUtilities {
    public boolean isPalindrome(String s) {

        String reversedString = new StringBuilder(s).reverse().toString();

        return s.equals(reversedString);
    }


    public List<String> splitCommaSeparatedLine(String s) {

        String[] stringsArray = s.split("\\s*,\\s*");


        List<String> stringsList = Arrays.asList(stringsArray);

        return stringsList;

    }
}

/*
Question and Answer:
Q1. Note that source and test classes should be in separate folders (src/main/java, src/test/java). What do you notice if they are all in src/main/java?
A1. This creates confusion, specially when it comes to the responsiblity/role of each class.
*  */