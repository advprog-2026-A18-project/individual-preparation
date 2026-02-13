package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    void testSubtract() {
        // Skenario Normal
        double[] v1 = {10.0, 20.0, 30.0};
        double[] v2 = {1.0, 2.0, 3.0};

        // Ekspektasi: 10-1=9, 20-2=18, 30-3=27
        double[] expected = {9.0, 18.0, 27.0};
        double[] result = vectorUtility.subtract(v1, v2);

        // Pakai assertArrayEquals untuk membandingkan isi array
        assertArrayEquals(expected, result);
    }

    @Test
    void testSubtractDimensionMismatch() {
        // Skenario Error: Panjang array beda
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0}; // Cuma 1 elemen

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.subtract(v1, v2);
        });
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
        // TODO: implement norm test succeed
    }

    @Test
    void testNormNegativeValues() {
        // TODO: implement norm with negative values
    }
}