package com.kevintamakuwala.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;

    StringCalculatorTest() {
        calculator = new StringCalculator();
    }

    // Empty String
    @Test
    public void testAddEmptyString() {
        assertEquals(0, calculator.add(""));
    }

    // Single Number
    @Test
    public void testAddSingleNumber() {
        assertEquals(7, calculator.add("7"));
    }

    // Two Numbers
    @Test
    public void testAddTwoNumbersSeparatedByComma() {
        assertEquals(6, calculator.add("1,5"));
    }

    // 'N' Numbers
    @Test
    public void testAddMultipleNumbersSeparatedByComma() {
        assertEquals(10, calculator.add("0,0,1,2,3,4"));
    }

    // New Line as Delimiter
    @Test
    public void testAddNewLineAsDelimiter() {
        assertEquals(6, calculator.add("1\n2\n3"));
    }

    // comma and New Line as Delimiter
    @Test
    public void testAddCommaAndNewLineAsDelimiter() {
        assertEquals(0, calculator.add("\n"));
        assertEquals(6, calculator.add("1\n2,3\n"));
    }
}
