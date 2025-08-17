package com.omsprog.algorithms.leetcode.medium.camelcasematching;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();

        char[] charsInPattern = pattern.toCharArray();

        for(String query : queries) {
            char[] charsInQuery = query.toCharArray();
            result.add(queryMatchesPattern(charsInPattern, charsInQuery));
        }

        return result;
    }

    private boolean queryMatchesPattern(char[] charsInPattern, char[] charsInQuery) {
        int b = 0;
        for(char charInPattern : charsInPattern) {
            if(b == charsInQuery.length) return false;
            if(charInPattern == charsInQuery[b]) {
                ++b;
            } else { // search a in charsInQuery
                while(b < charsInQuery.length && charInPattern != charsInQuery[b]) {
                    if(Character.isUpperCase(charsInQuery[b])) return false;
                    ++b;
                }
                if(b == charsInQuery.length) return false; // 'a' was not found in charsInQuery
                ++b;
            }
        }

        while(b < charsInQuery.length) {
            if(Character.isUpperCase(charsInQuery[b])) return false;
            ++b;
        }

        return true;
    }
}
