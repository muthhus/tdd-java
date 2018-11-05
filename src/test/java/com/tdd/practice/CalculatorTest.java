package com.tdd.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private static final String givenStringNos = "1,2,3\n4,100,999,1010, 1005, 4001, 2003";

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void givenStringNosPresentTest() throws Exception{
        Assert.assertNotNull("Given Strings No's are available to do calculation", givenStringNos);
    }

    @Test
    public void givenStringsNotEmptyTest() throws Exception{
        Assert.assertFalse(givenStringNos.length()<0);
    }

    @Test
    public void calculatorIsPresent() throws Exception{
        Assert.assertNotNull(calculator);
    }
    
}
