package org.imgal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Statistics class.
 */
public class StatisticsTest {

    /**
     * Test the sum method with integer values.
     */
    @Test
    public void testSumIntegers() throws Throwable {
        double[] data = {2.0, 5.0, 10.0, 23.0};
        double result = Statistics.sum(data);
        assertEquals(40.0, result, 0.00001, "Sum of integers should be 40.0");
    }

    /**
     * Test the sum method with floating-point values.
     */
    @Test
    public void testSumFloats() throws Throwable {
        double[] data = {1.5, 2.5, 3.5, 4.5};
        double result = Statistics.sum(data);
        assertEquals(12.0, result, 0.00001, "Sum of floats should be 12.0");
    }

    /**
     * Test the sum method with an empty array.
     */
    @Test
    public void testSumEmpty() throws Throwable {
        double[] data = {};
        double result = Statistics.sum(data);
        assertEquals(0.0, result, 0.00001, "Sum of empty array should be 0.0");
    }

    /**
     * Test the sum method with negative numbers.
     */
    @Test
    public void testSumNegative() throws Throwable {
        double[] data = {-1.0, -2.0, -3.0, -4.0};
        double result = Statistics.sum(data);
        assertEquals(-10.0, result, 0.00001, "Sum of negative numbers should be -10.0");
    }
} 