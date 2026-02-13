package com.omsprog.algorithms.leetcode.easy.maximum69number;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String numStr = num + "";
        StringBuilder sbdr = new StringBuilder();
        boolean foundNine = false;

        for(char c : numStr.toCharArray()) {
            if(!foundNine) {
                if(c == '6') {
                    sbdr.append('9');
                    foundNine = true;
                } else
                    sbdr.append(c);
            } else
                sbdr.append(c);
        }

        return Integer.parseInt(sbdr.toString());
    }
}
