package com.tdd.practice.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;

@RunWith(JUnit4.class)
public class ReverseStringTest {

    private static final String gnString = "World";

    private static final String palindromeString = "liril";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private ReverseString reverseString;

    @Before
    public void setUp(){
        reverseString = new ReverseString();
    }

    @Test
    public void testReverseStringNotNull(){
        Assert.assertNotNull(reverseString);
    }

    @Test
    public void testReverseStringException() {
        reverseString.convertString(gnString);
        Assert.assertNotNull(gnString);
    }

    @Test
    public void testGivenStringAndResult() {
        Assert.assertEquals("dlroW", reverseString.convertString(gnString));
    }

    @Test
    public void testIsthatGivenStringIsPalindrome(){
        Assert.assertThat(reverseString.convertString(palindromeString), is(palindromeString));
    }

    @Test
    public void testPalidrome(){
        Assert.assertTrue(reverseString.palindrome(palindromeString, reverseString.convertString(palindromeString)));
    }

}
