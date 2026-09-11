package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remainders {

    public void printRemainders(int divisor) {
        List<Integer> remainders = new ArrayList<>();
        for (int i = 1; i <= 20; i ++) {
            remainders.add(i % divisor);
        }
        String output = remainders.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println(output);

    }



    public Map<Integer, List<Integer>> remainderGroups(int divisor) {

        Map<Integer, List<Integer>> result = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(number -> number % divisor));

        return result;
    }



    public Map<Integer, Long> remainderCounts(int divisor) {

        Map<Integer, Long> result = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(number -> number % divisor, Collectors.counting()));

        return result;

    }


}
