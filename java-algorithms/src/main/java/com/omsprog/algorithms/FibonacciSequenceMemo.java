package com.omsprog.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequenceMemo {
    public static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    public static int generate(int n) {
        if(!memo.containsKey(n)) {
            memo.put(n, generate(n - 1) + generate(n - 2));
        }
        return memo.get(n);
    }
}
