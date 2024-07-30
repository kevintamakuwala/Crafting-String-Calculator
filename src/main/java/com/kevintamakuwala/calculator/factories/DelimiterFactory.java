package com.kevintamakuwala.calculator.factories;

import com.kevintamakuwala.calculator.strategies.DefaultDelimiterStrategy;
import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;
import com.kevintamakuwala.calculator.strategies.DifferentDelimiterStrategy;

public class DelimiterFactory {

    private static final String DIFFERENT_DELIMITER_PREFIX = "//";

    /**
     * Returns the appropriate DelimiterStrategy based on the input string.
     *
     * @param numbers the input string containing numbers
     * @return an instance of DelimiterStrategy
     * @throws IllegalArgumentException if the input string is null
     */
    public static DelimiterStrategy getDelimiterStrategy(String numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if (numbers.startsWith(DIFFERENT_DELIMITER_PREFIX)) {
            return new DifferentDelimiterStrategy();
        }
        return new DefaultDelimiterStrategy();
    }
}