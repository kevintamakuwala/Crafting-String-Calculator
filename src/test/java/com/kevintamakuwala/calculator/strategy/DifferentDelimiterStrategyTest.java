package com.kevintamakuwala.calculator.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;
import com.kevintamakuwala.calculator.strategies.DifferentDelimiterStrategy;

public class DifferentDelimiterStrategyTest {
    private DelimiterStrategy strategy;

    DifferentDelimiterStrategyTest() {
        strategy = new DifferentDelimiterStrategy();
    }

    // Different Delimiter Strategy Testing
    @Test
    public void testDifferentDelimiterStrategy() {
        assertEquals("1,2", strategy.transformNumbers("//;\n1;2"));
        assertEquals("1,2,3", strategy.transformNumbers("//;\n1;2,3"));
    }
}
