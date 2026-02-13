package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();
    private final double precision = 0.0001;

    @Test
    void testAddSucceed(){
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
    void testSubtractSucceed(){
       // TODO: implement subtract test succeed
    }

    @Test
    void testSubtractDimensionFailed() {
        // TODO: implement subtract test failed
    }

    @Test
    void testMultiplySucceed(){
        // TODO: implement multiply test succeed
    }

    @Test
    void testMultiplyByZeroFailed() {
        // TODO: implement multiply test failed
    }

    @Test
    void testDotProductSucceed(){
        // TODO: implement dot product test succeed
    }

    @Test
    void testDotProductDimensionFailed() {
        // TODO: implement dot product test failed
    }

    @Test
    void testNormSucceed(){
        // TODO: implement norm test succeed
    }

    @Test
    void testNormNegativeValues() {
        // TODO: implement norm with negative values
    }







}
