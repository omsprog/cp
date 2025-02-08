package com.omsprog.algorithms.lc;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if(currentChar == '(' || currentChar == '[' || currentChar == '{') {
                st.push(currentChar);
            } else {

                if(st.size() == 0)
                    return false;

                char poppedChar = st.pop();

                if(currentChar == ')' && poppedChar != '(')
                    return false;
                if(currentChar == ']' && poppedChar != '[')
                    return false;
                if(currentChar == '}' && poppedChar != '{')
                    return false;
            }
        }

        if(st.size() == 0)
            return true;
        return false;
    }
}
