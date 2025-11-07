package com.omsprog.algorithms.leetcode.easy.maximumnumberofwordsyoucantype;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> memory = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++)
            memory.add(brokenLetters.charAt(i));
        String[] strs = text.split(" ");
        int ans = 0;
        for(String str : strs) {
            boolean canBeFullyTyped = true;
            for(char c : str.toCharArray()) {
                if(memory.contains(c)) {
                    canBeFullyTyped = false;
                    break;
                }
            }
            if(canBeFullyTyped) ++ans;
        }
        return ans;
    }
}
