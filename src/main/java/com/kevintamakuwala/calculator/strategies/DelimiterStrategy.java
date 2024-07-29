// Author: @kevintamakuwala
package com.kevintamakuwala.calculator.strategies;

public abstract class DelimiterStrategy {
    /**
     * Transforms the input string of numbers by replacing custom delimiters with a
     * standardized format.
     * 
     * @param numbers the input string containing numbers and delimiters
     * @return a string where all delimiters are replaced with a standardized format
     */
    public abstract String transformNumbers(String numbers);
}
