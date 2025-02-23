package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c != ']')
                stack.push(c);
            else {
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '[') {
                    sb.append(stack.pop());
                }
                stack.pop(); //remove '['
                StringBuilder sbDigit = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    sbDigit.insert(0, stack.pop());
                }
                int repetitions = Integer.parseInt(sbDigit.toString());
                String fs = sb.reverse().toString();
                sb = new StringBuilder();
                for(int i = 0; i < repetitions; i++) {
                    sb.append(fs);
                }
                char[] fc = sb.toString().toCharArray();
                for(char ch : fc) {
                    stack.push(ch);
                }
            }
        }

        char[] rc = new char[stack.size()];
        for(int k = 0; k < rc.length; k++) {
            rc[rc.length - 1 - k] = stack.pop();
        }
        return new String(rc);
    }
}
