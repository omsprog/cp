package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    private void backtrack(String input, StringBuilder sb, Map<Character, String> mapping, List<String> combinations, int currentIndex) {
        if(sb.length() == input.length()) {
            combinations.add(sb.toString());
            return;
        }
        char digit = input.charAt(currentIndex);
        for(char c : mapping.get(digit).toCharArray()) {
            sb.append(c);
            backtrack(input, sb, mapping, combinations, currentIndex + 1);
            sb.setLength(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");

        List<String> combinations = new ArrayList<>();

        if(digits.isEmpty()) return combinations;

        backtrack(digits, new StringBuilder(), mapping, combinations, 0);

        return combinations;
    }
}
