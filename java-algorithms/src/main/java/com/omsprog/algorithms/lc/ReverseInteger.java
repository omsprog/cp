package com.omsprog.algorithms.lc;

public class ReverseInteger {
    public int reverse(int x) {
        String xStr = String.valueOf(Math.abs(x));
        StringBuilder sB = new StringBuilder();
        boolean isNegative = x < 0;

        if(isNegative) {
            sB.append("-");
        }

        for(int i = xStr.length() - 1; i >= 0; i--) {
            sB.append(xStr.charAt(i));
        }

        try {
            return Integer.valueOf(sB.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
