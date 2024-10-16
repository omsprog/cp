package com.omsprog.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestHappyString {
    public static String longestDiverseString(int a, int b, int c) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Determine the largest number
        if (a >= b && a >= c) {
            map.put('a', a);
            if (b >= c) {
                map.put('b', b);
                map.put('c', c);
            } else {
                map.put('c', c);
                map.put('b', b);
            }
        } else if (b >= a && b >= c) {
            map.put('b', b);
            if (a >= c) {
                map.put('a', a);
                map.put('c', c);
            } else {
                map.put('c', c);
                map.put('a', a);
            }
        } else {
            map.put('c', c);
            //System.out.println("Im here");
            if (a >= b) {
                map.put('a', a);
                map.put('b', b);
            } else {
                map.put('b', b);
                map.put('a', a);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(map.get('a') != 0 || map.get('b') != 0 || map.get('c') != 0) {
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                if(entry.getValue() == 0) continue;
                if(entry.getValue() > 1) {
                    sb.append(String.format("%s%s", entry.getKey(), entry.getKey()));
                    entry.setValue(entry.getValue() - 2);
                } else {
                    sb.append(entry.getKey());
                    entry.setValue(entry.getValue() -1);
                }
            }
        }

        return sb.toString();
    }
}
