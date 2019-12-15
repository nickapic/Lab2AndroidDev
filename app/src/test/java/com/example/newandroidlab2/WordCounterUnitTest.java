package com.example.newandroidlab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterUnitTest {

    @Test
    public void charCounter_isCorrect() {
        final String givenString ="yo dude";
        final int expectedResult = 6;
        final int actualResult = WordCounter.charCounter(givenString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void wordCounter_isCorrect() {
        final String givenString ="yo,dude";
        final int expectedResult = 2;
        final int actualResult = WordCounter.charCounter(givenString);
        assertEquals(expectedResult, actualResult);
    }
}