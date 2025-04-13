package com.omsprog.algorithms.lc;

public class CountSymmetricIntegers {
    private int sumCharacters(String s) {
        int sum = 0;
        for(int a = 0; a < s.length(); a++) {
            char c = s.charAt(a);
            int v = c - '0';
            sum += v;
        }
        return sum;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int n = low; n <= high; n++) {
            String nRep = String.valueOf(n);
            if(nRep.length() % 2 != 0) continue;
            String part1 = nRep.substring(0, nRep.length() / 2);
            String part2 = nRep.substring(nRep.length() / 2);

            if(sumCharacters(part1) == sumCharacters(part2))
                ++count;
        }
        return count;
    }
}
