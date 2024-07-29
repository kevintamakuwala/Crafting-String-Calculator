package com.kevintamakuwala.calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        }

        // Adding numbers using stream API :)
        return Arrays.stream(numbers.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
