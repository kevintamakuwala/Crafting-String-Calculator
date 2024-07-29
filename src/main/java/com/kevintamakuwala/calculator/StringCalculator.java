// Author: @kevintamakuwala
package com.kevintamakuwala.calculator;

import java.util.Arrays;

import com.kevintamakuwala.calculator.factories.DelimiterFactory;
import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;

public class StringCalculator {

    private DelimiterStrategy delimiterStrategy = null;

    /**
     * @param numbers the input string containing numbers and delimiters
     * @return the sum of the numbers in the input string
     */
    public int add(String numbers) {

        if (numbers == null || numbers.length() == 0) {
            return 0;
        }

        // get delimiter strategy
        delimiterStrategy = DelimiterFactory.getDelimiterStrategy(numbers);

        // converts new line to comma
        numbers = delimiterStrategy.transformNumbers(numbers);

        // Adding numbers using stream API :)
        return Arrays.stream(numbers.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
