package com.example.user.wordcounterlab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */

public class WordCounterTest {

    @Test
    public void getLength(){
        WordCounter wordCounter = new WordCounter();
        int value =wordCounter.getNumberOfWord("test number one");
        assertEquals(3,value);
    }
}
