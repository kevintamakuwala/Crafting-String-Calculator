package com.kevintamakuwala.calculator.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kevintamakuwala.calculator.strategies.DefaultDelimiterStrategy;
import com.kevintamakuwala.calculator.strategies.DelimiterStrategy;

public class DefaultDelimiterStrategyTest {

    private DelimiterStrategy strategy;

    DefaultDelimiterStrategyTest() {
        strategy = new DefaultDelimiterStrategy();
    }

    // Default Delimiter Strategy Testing
    @Test
    public void testDefaultDelimiterStrategy() {
        assertEquals("1,2,3", strategy.transformNumbers("1\n2,3"));
        assertEquals("1,2,3", strategy.transformNumbers("1\n2\n3"));
    }
}
