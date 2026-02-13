package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
    private final double precision = 0.0001;

    @Test
    void testAdd(){
        // TODO: implement
    }

    @Test
    void testSubtract(){
        // TODO: implement
        assertEquals(5.0, arithmeticUtility.subtract(10.0, 5.0), precision);

        assertEquals(-2.0, arithmeticUtility.subtract(3.0, 5.0), precision);
    }

    @Test
    void testMultiply(){
        // TODO: implement
    }

    @Test
    void testDivideNormal(){
        // TODO: implement division not by zero
    }

    @Test
    void testDivideByZero(){
        // TODO: implement division by zero
    }

    @Test
    void testExponentPositive(){
        assertEquals(8.0, arithmeticUtility.exponent(2.0, 3), precision);
    }

    @Test
    void testExponentZero(){
        assertEquals(1.0, arithmeticUtility.exponent(2.0, 0), precision);
    }

    @Test
    void testExponentNegative(){
        assertEquals(0.5, arithmeticUtility.exponent(2.0, -1), precision);
    }

}
