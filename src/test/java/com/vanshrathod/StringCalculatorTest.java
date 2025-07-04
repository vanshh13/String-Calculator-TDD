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
        assertEquals(5, stringCalculator.add("5"));
        assertEquals(7, stringCalculator.add("7"));
    }

    @Test
    public void testTwoNumbersCommaSeparated() {
        assertEquals(12, stringCalculator.add("7,5"));
        assertEquals(13, stringCalculator.add("8,5"));
    }

}
