package com.sample.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	public static Calculator calculator;
	
	@BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }
	
	@Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }
 
    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }
    
    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
 
        assertEquals(7, result);
    }
    
    
    
    @Test
    public void testSub() {
        int result = calculator.sub(6, 4);
 
        assertEquals(2, result);
    }
    
    @Test
    public void testMul() {
        int result = calculator.mul(3, 4);
 
        assertEquals(12, result);
    }
    
    
    
    
    
}