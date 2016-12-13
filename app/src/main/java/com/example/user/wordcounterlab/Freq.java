package com.example.user.wordcounterlab;


import java.util.*;

/**
 * Created by user on 13/12/2016.
 */


public class Freq {

    public static void getFrequence(String text) {
        String[] splitted = text.split(" ");


        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String a : splitted) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}