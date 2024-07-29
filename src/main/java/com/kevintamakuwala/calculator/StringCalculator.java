// Author: @kevintamakuwala
package com.kevintamakuwala.calculator;

import java.util.ArrayList;
import java.util.List;

import com.kevintamakuwala.calculator.exceptions.NegativeNumberException;
import com.kevintamakuwala.calculator.factories.DelimiterFactory;
import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;

public class StringCalculator {

    private DelimiterStrategy delimiterStrategy = null;

    /**
     * @param numbers the input string containing numbers and delimiters
     * @return the sum of the numbers in the input string
     */
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        delimiterStrategy = DelimiterFactory.getDelimiterStrategy(numbers);

        String[] nums = delimiterStrategy.transformNumbers(numbers).split(",");

        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String num : nums) {
            num = num.trim();
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    negativeNumbers.add(number);
                } else {
                    sum += number;
                }
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new NegativeNumberException("Negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }
}