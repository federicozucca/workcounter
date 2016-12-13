package com.example.user.wordcounterlab;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 13/12/2016.
 */

public class WordCounter {

    public WordCounter() {
    }

    public int getNumberOfWord(String text) {
        String[] splitted = text.split(" ");
        return splitted.length;
    }


    }

