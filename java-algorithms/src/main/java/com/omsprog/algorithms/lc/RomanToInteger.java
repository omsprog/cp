package com.omsprog.algorithms.lc;

public class RomanToInteger {
    public int romanToInt(String s) {
        int romanNum = 0;
        int pointer = s.length() - 1;

        while(pointer >= 0) {

            int localNum = 0;

            if(s.charAt(pointer) == 'M') {
                localNum = 1000;

                if(pointer > 0 && s.charAt(pointer - 1) == 'C') {
                    localNum = 900;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'D') {
                localNum = 500;

                if(pointer > 0 && s.charAt(pointer - 1) == 'C') {
                    localNum = 400;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'C') {
                localNum = 100;

                if(pointer > 0 && s.charAt(pointer - 1) == 'X') {
                    localNum = 90;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'L') {
                localNum = 50;

                if(pointer > 0 && s.charAt(pointer - 1) == 'X') {
                    localNum = 40;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'X') {
                localNum = 10;

                if(pointer > 0 && s.charAt(pointer - 1) == 'I') {
                    localNum = 9;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'V') {
                localNum = 5;

                if(pointer > 0 && s.charAt(pointer - 1) == 'I') {
                    localNum = 4;
                    pointer = pointer - 1;
                }

                romanNum += localNum;
                --pointer;
                continue;
            }
            if(s.charAt(pointer) == 'I') {
                localNum = 1;

                romanNum += localNum;
                --pointer;
                continue;
            }
        }

        return romanNum;
    }
}
