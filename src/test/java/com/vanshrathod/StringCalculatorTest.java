package com.vanshrathod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void testSingleNumberReturnsSameNumber() {
        assertEquals(1, stringCalculator.add("5"));
        assertEquals(5, stringCalculator.add("7"));
    }
}
