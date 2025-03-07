package com.omsprog.algorithms.lc;

public class AddDigits {
    public int addDigits(int num) {
        if(num < 10) return num;

        int accum = 0;

        while(!(num < 10)) {
            String conv = num + "";
            accum = 0;
            for(int i = 0; i < conv.length(); i++)
                accum += Integer.parseInt(conv.charAt(i) + "");
            num = accum;
        }

        return accum;
    }
}
