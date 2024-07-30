// Author: @kevintamakuwala
package com.kevintamakuwala.calculator.strategies;

public class DefaultDelimiterStrategy extends DelimiterStrategy {
    /**
     * Transforms the input string of numbers by replacing newline characters with
     * commas.
     * 
     * @param numbers the input string containing numbers and delimiters
     * @return a string where all newline characters are replaced with commas
     */
    @Override
    public String transformNumbers(String numbers) {
        return numbers.replaceAll("\n", ",");
    }
}
