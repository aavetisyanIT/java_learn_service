package com.aavetisyanIT.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }
    @Test
    public void canAddZeroPlusZero () {
        int sum = calc.add(0,0);
        assertEquals(0,sum);
    }
    @Test
    public void canAddOnePlusOne () {
        int sum = calc.add(1,1);
        assertEquals(2,sum);
    }
    @Test()
    @Disabled
    public void canAddMaxIntPlusOne () {
        long maxIntNum = Integer.MAX_VALUE;
        int sum = calc.add(Integer.MAX_VALUE,1);
        assertEquals(maxIntNum + 1,sum);
    }
}
