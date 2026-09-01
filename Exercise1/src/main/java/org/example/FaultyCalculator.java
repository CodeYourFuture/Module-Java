package org.example;

import java.util.Arrays;
import java.util.List;

public class FaultyCalculator {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10, 20, 30, 40);

        double average = calculateAverage(values);
        System.out.println("Average = " + average);  // Expected: 25
    }

    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            Integer currentNumber = numbers.get(i);
            sum += currentNumber;
        }

        return (double) sum / numbers.size();
    }
}

/*
 After placing a breakpoint at the for loop, and stepping into it, I noticed that the loop starts iterating at i = 1.
 This means the current number will start at 20, eventually leading to a sum of 90, and average of 22.5.
 To solve this we need the loop to start iterating at index 0, so that 10 is no longer skipped. This way, the total
 adds up to 100 and the average to 25 respectively.
 */