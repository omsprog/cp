package com.omsprog.algorithms.lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        Map<Character, Integer> word1S = new HashMap<>();
        Map<Character, Integer> word2S = new HashMap<>();

        for(int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if(word1S.containsKey(c1)) {
                int occurrences1 = word1S.get(c1);
                word1S.put(c1, ++occurrences1);
            } else
                word1S.put(c1, 1);

            if(word2S.containsKey(c2)) {
                int occurrences2 = word2S.get(c2);
                word2S.put(c2, ++occurrences2);
            } else
                word2S.put(c2, 1);
        }

        if(!word1S.keySet().equals(word2S.keySet()))
            return false;

        int[] n1 = new int[word1S.size()];
        int[] n2 = new int[word2S.size()];

        int j = 0;
        for(Map.Entry<Character, Integer> entry1 : word1S.entrySet()) {
            n1[j] = entry1.getValue();
            ++j;
        }

        j = 0;
        for(Map.Entry<Character, Integer> entry2 : word2S.entrySet()) {
            n2[j] = entry2.getValue();
            ++j;
        }

        Arrays.sort(n1);
        Arrays.sort(n2);

        return Arrays.equals(n1, n2);
    }
}
