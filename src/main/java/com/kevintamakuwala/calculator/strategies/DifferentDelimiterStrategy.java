// Author: @kevintamakuwala

package com.kevintamakuwala.calculator.strategies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentDelimiterStrategy extends DelimiterStrategy {

    /**
     * Transforms the input string of numbers by replacing custom delimiters
     * "//[delimiter]\n[numbers]" with commas.
     * Supports multiple delimiters and delimiters of any length.
     *
     * @param numbers the input string containing numbers and delimiters
     * @return a string where all delimiters are replaced with commas
     * @throws IllegalArgumentException if the input string is invalid
     */
    @Override
    public String transformNumbers(String numbers) {
        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            if (newlineIndex > 0) {
                String delimiterSection = numbers.substring(2, newlineIndex);
                numbers = numbers.substring(newlineIndex + 1);

                // multiple delimiters
                List<String> delimiters = parseDelimiters(delimiterSection);
                for (String delimiter : delimiters) {
                    numbers = numbers.replace(delimiter, ",");
                }
                return numbers;
            } else {
                throw new IllegalArgumentException("Invalid input string");
            }
        }
        return numbers.replace("\n", ",");

    }

    /**
     * Parses the delimiter section and constructs a list of delimiters.
     *
     * @param delimiterSection the section of the input string that specifies
     *                         delimiters
     * @return a list of delimiters
     */
    private List<String> parseDelimiters(String delimiterSection) {
        // [.][;] -> ["." , ";"]
        if (delimiterSection.startsWith("[") && delimiterSection.endsWith("]")) {
            return Arrays.stream(delimiterSection.substring(1, delimiterSection.length() - 1).split("\\]\\["))
                    .collect(Collectors.toList());
        }
        return List.of(delimiterSection);
    }
}