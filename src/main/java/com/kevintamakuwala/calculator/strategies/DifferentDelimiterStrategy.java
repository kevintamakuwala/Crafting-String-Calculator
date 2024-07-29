//  Author: @kevintamakuwala

package com.kevintamakuwala.calculator.strategies;

public class DifferentDelimiterStrategy extends DelimiterStrategy {

    /**
     * Transforms the input string of numbers by replacing custom delimiters
     * "//[delimiter]\n[numbers]" with commas.
     * If a custom delimiter is specified at the beginning of the string, it will be
     * used to split the numbers. Otherwise, newlines are replaced with commas.
     *
     * @param numbers the input string containing numbers and delimiters
     * @return a string where all delimiters are replaced with commas
     * @throws IllegalArgumentException if the input string is invalid
     */
    @Override
    public String transformNumbers(String numbers) {
        String delimiter = ",";

        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");

            if (newlineIndex > 0) {
                delimiter = numbers.substring(2, newlineIndex);
                numbers = numbers.substring(newlineIndex + 1)
                        .replace(delimiter, ",");
            } else {
                throw new IllegalArgumentException("Invalid input string");
            }
        } else {
            numbers = numbers.replace("\n", delimiter);
        }

        return numbers;
    }
}