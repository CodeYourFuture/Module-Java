package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShapeCounter {

    public long countShapesWithSides(Map<String, Integer> shapesToSides, int numberOfSides) {

        return shapesToSides.values().stream()
                .filter(value -> value == numberOfSides)
                .count();

    }
}
