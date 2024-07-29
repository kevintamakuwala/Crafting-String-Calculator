package com.kevintamakuwala.calculator;

import java.util.Arrays;

import com.kevintamakuwala.calculator.strategies.DefaultDelimiterStrategy;
import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;

public class StringCalculator {

    private DelimiterStrategy delimiterStrategy = null;

    public int add(String numbers) {

        if (numbers == null || numbers.length() == 0) {
            return 0;
        }

        delimiterStrategy = new DefaultDelimiterStrategy();
        
        // converts new line to comma
        numbers = delimiterStrategy.transformNumbers(numbers);

        // Adding numbers using stream API :)
        return Arrays.stream(numbers.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
