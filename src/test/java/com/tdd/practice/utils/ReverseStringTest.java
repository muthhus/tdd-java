package com.tdd.practice.utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ReverseStringTest {

    private static final String gnString = "World";

    @Rule
    ExpectedException expectedException = ExpectedException.none();

    private ReverseString reverseString;

    @Before
    public void setUp(){
        reverseString = new ReverseString();
    }

    @Test
    public void testReverseStringException() {
        expectedException.expect(RuntimeException.class);
        reverseString.convertString(gnString);
    }

}
