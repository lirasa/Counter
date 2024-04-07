package com.example.counter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Null_getCharsCount_ZeroReturned() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Null_getWordsCount_ZeroReturned() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Word_getCharsCount_ReturnedFive() {
        String givenString = "Hello";
        int expectedValue = 5;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Word_getWordsCount_ReturnedOne() {
        String givenString = "Hello";
        int expectedValue = 1;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Text_getCharsCount_ReturnedTwelve() {
        String givenString = "Hello world!";
        int expectedValue = 12;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Text_getWordsCount_ReturnedTwo() {
        String givenString = "Hello world!";
        int expectedValue = 2;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Spaces_getCharsCount_ReturnedThree() {
        String givenString = "   ";
        int expectedValue = 3;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_Spaces_getWordsCount_ZeroReturned() {
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_SeparateSymbols_getCharsCount_ReturnedTen() {
        String givenString = ";;; .  ,, ";
        int expectedValue = 10;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_SeparateSymbols_getWordsCount_ZeroReturned() {
        String givenString = ";;; .  ,, ";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

}