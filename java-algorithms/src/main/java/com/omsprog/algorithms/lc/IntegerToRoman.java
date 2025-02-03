package com.omsprog.algorithms.lc;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String numStr = String.valueOf(num);
        int numLength = numStr.length();
        int auxNumLength = numLength;
        StringBuilder rep = new StringBuilder();

        for(int in = 0; in < numLength; in++) {
            int digit = Character.getNumericValue(numStr.charAt(in));

            if(auxNumLength == 4) {
                for(int i = 0; i < digit; i++)
                    rep.append("M");
            }

            if(auxNumLength == 3) {
                if(digit == 9)
                    rep.append("CM");
                else if(digit > 4 && digit < 9) {
                    rep.append("D");
                    for(int i = 0; i < digit - 5; i++) {
                        rep.append("C");
                    }
                } else if(digit == 4) {
                    rep.append("CD");
                } else if(digit > 0) {
                    for(int i = 0; i < digit; i++) {
                        rep.append("C");
                    }
                }
            }

            if(auxNumLength == 2) {
                if(digit == 9)
                    rep.append("XC");
                else if(digit > 4 && digit < 9) {
                    rep.append("L");
                    for(int i = 0; i < digit - 5; i++) {
                        rep.append("X");
                    }
                } else if(digit == 4) {
                    rep.append("XL");
                } else if(digit > 0) {
                    for(int i = 0; i < digit; i++) {
                        rep.append("X");
                    }
                }
            }

            if(auxNumLength == 1) {
                if(digit == 9)
                    rep.append("IX");
                else if(digit > 4 && digit < 9) {
                    rep.append("V");
                    for(int i = 0; i < digit - 5; i++) {
                        rep.append("I");
                    }
                } else if(digit == 4) {
                    rep.append("IV");
                } else if(digit > 0) {
                    for(int i = 0; i < digit; i++) {
                        rep.append("I");
                    }
                }
            }
            --auxNumLength;
        }

        return rep.toString();
    }
}
