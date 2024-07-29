package com.kevintamakuwala.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.kevintamakuwala.calculator.exceptions.NegativeNumberException;

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

    // Different Delimiter
    @Test
    public void testAddDifferentDelimiter() {
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(6, calculator.add("//;\n1;2,3"));
    }

    // Negative Numbers
    @Test
    public void testAddNegativeNumbers() {
        try {
            calculator.add("-1,2");
        } catch (NegativeNumberException e) {
            assertEquals("Negatives not allowed: [-1]", e.getMessage());
        }
    }

    // Numbers greater than 1000
    @Test
    public void testAddNumbersGreaterThan1000() {
        assertEquals(2, calculator.add("2,1001"));
    }
}
