package com.kevintamakuwala.calculator.strategies;

public class DefaultDelimiterStrategy implements DelimiterStrategy {

    @Override
    public String transformNumbers(String numbers) {
        return numbers.replaceAll("\n", ",");
    }
}
