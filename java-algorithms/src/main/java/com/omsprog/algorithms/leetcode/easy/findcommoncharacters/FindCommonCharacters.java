package com.omsprog.algorithms.leetcode.easy.findcommoncharacters;

import java.util.*;

public class FindCommonCharacters {
    private Map<Character, Integer> calculateFrequencies(String word) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for(char c : word.toCharArray()) {
            if(frequencies.containsKey(c)) {
                int val = frequencies.get(c);
                frequencies.put(c, val + 1);
            } else
                frequencies.put(c, 1);
        }
        return frequencies;
    }

    public List<String> commonChars(String[] words) {
        Map<Character, Integer> frequencies = calculateFrequencies(words[0]);

        if(words.length > 1) {
            for(int i = 1; i < words.length; i++) {
                String str = words[i];
                Map<Character, Integer> currentFrequencies = calculateFrequencies(str);
                Set<Character> keysToRemove = new HashSet<>();
                for(Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
                    Character key = entry.getKey();
                    if(currentFrequencies.containsKey(key)) {
                        int newFrequency = Math.min(entry.getValue(), currentFrequencies.get(key));
                        frequencies.put(key, newFrequency);
                    } else
                        keysToRemove.add(key);
                }
                // remove keys from frequencies
                for(Character keyToRemove : keysToRemove)
                    frequencies.remove(keyToRemove);
            }
        }

        // building result
        List<String> result = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            int frequency = entry.getValue();
            for(int i = 0; i < frequency; i++)
                result.add(entry.getKey() + "");
        }
        return result;
    }
}
