package com.omsprog.algorithms.lc;

public class IsSequence {
    public boolean isSubsequence(String s, String t) {
        int pointerA = 0;
        int pointerB = 0;

        for(; pointerA < s.length(); pointerA++) {
            char c =  s.charAt(pointerA);

            // index of pointerB is out bounds
            if(pointerB >= t.length()) return false;

            boolean found = false;

            while(!found && pointerB < t.length()) {
                if(c == t.charAt(pointerB)) {
                    found = true;
                    ++pointerB;
                    break;
                } else
                    ++pointerB;
            }

            if(!found) return false;
        }

        return true;
    }
}
