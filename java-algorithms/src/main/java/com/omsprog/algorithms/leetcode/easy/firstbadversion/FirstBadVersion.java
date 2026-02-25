package com.omsprog.algorithms.leetcode.easy.firstbadversion;

import java.util.HashMap;
import java.util.Map;

public class FirstBadVersion {
    // dummy method for testing purposes
    private boolean isBadVersion(int n) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, false);
        map.put(2, false);
        map.put(3, false);
        map.put(4, false);
        map.put(5, false);
        map.put(6, false);
        map.put(7, false);
        map.put(8, true);
        map.put(9, true);
        map.put(10, true);

        return map.get(n);
    }

    public int firstBadVersion(int n) {
        int l = 1, r = n;
        int first = -1;
        while(l <= r) {
            int m = l + (r - l)/2;
            if(isBadVersion(m)) {
                first = m;
                r = m - 1;
            } else
                l = m + 1;
        }

        return first;
    }
}
