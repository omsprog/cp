package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> mapping = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char cInS = s.charAt(i);
            char cInT = t.charAt(i);
            if(mapping.containsKey(cInS)) {
                if(mapping.get(cInS) != cInT) return false;
            } else {
                if(mapping.containsValue(cInT)) return false;
                mapping.put(cInS, cInT);
            }
        }

        return true;
    }
}
