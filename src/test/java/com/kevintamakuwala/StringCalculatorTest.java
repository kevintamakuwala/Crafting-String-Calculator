package com.kevintamakuwala;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.kevintamakuwala.calculator.StringCalculator;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
}
