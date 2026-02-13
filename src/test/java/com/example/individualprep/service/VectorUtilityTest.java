package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();
    private final double precision = 0.0001;

    @Test
    void testAddSucceed() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {3.0, 4.0};
        double[] expected = {4.0, 6.0};
        assertArrayEquals(expected, vectorUtility.add(v1, v2), precision);
    }

    @Test
    void testAddDimensionFailed() {
        double[] v1 = {1.0};
        double[] v2 = {1.0, 2.0};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }

    @Test
    void testSubtractSucceed() {
        double[] v1 = {5.0, 6.0};
        double[] v2 = {2.0, 4.0};
        double[] expected = {3.0, 2.0};
        assertArrayEquals(expected, vectorUtility.subtract(v1, v2), precision);
    }

    @Test
    void testSubtractDimensionFailed() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {1.0, 2.0};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(v1, v2));
    }

    @Test
    void testMultiplySucceed() {
        double[] v1 = {1.0, 2.0, 3.0};
        int x = 2;
        double[] expected = {2.0, 4.0, 6.0};
        assertArrayEquals(expected, vectorUtility.multiply(v1, x), precision);
    }

    @Test
    void testMultiplyByZeroFailed() {
        double[] v1 = {5.5, 10.1};
        int x = 0;
        double[] expected = {0.0, 0.0};
        assertArrayEquals(expected, vectorUtility.multiply(v1, x), precision);
    }

    @Test
    void testDotProductSucceed() {
        // TODO: implement dot product test Succeed
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        double expectedResult = 32.0;

        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(expectedResult, result);

    }

    @Test
    void testDotProductDimensionFailed() {
        // TODO: implement dot product test failed
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });

        assertEquals("Panjang vektor harus sama!", exception.getMessage());
    }

    @Test
    void testNormSucceed() {
        double[] v1 = {3.0, 4.0};
        double expected = 5.0;
        assertEquals(expected, vectorUtility.norm(v1), precision);
    }

    @Test
    void testNormNegativeValues() {
        double[] v1 = {-3.0, -4.0};
        double expected = 5.0;
        assertEquals(expected, vectorUtility.norm(v1), precision);
    }
}