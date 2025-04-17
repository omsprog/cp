package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> memory = new HashMap<>();

        // Add character/frequency to the memory
        for(char c : s.toCharArray()) {
            if(memory.containsKey(c)) {
                int oc = memory.get(c);
                memory.put(c, oc + 1);
            } else
                memory.put(c, 1);
        }

        // remove character/frequency from the memory
        for(char c : t.toCharArray()) {
            if(memory.containsKey(c)) {
                int oc = memory.get(c);
                if(oc == 1) memory.remove(c);
                else memory.put(c, oc - 1);
            } else
                return false;
        }

        return memory.size() == 0;
    }
}
