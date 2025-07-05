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
        assertEquals(97, stringCalculator.add("7,90"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(10, stringCalculator.add("1,2,3,4"));
        assertEquals(226, stringCalculator.add("90,38,58,40"));
    }
}
