package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, int[]> mem = new HashMap<>(); // int -> [min, max, curr]
        int longest = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if(!mem.containsKey(num)) {
                if(mem.containsKey(num - 1) && !mem.containsKey(num + 1)) { // right
                    int[] d = mem.get(num - 1);
                    int newLength = d[2] + 1;
                    int[] newArr = new int[] {d[0], num, newLength};
                    mem.put(num,  newArr);
                    mem.put(d[0], newArr);
                    if(newLength > longest) longest = newLength;
                } else if(mem.containsKey(num + 1) && !mem.containsKey(num - 1)) { // left
                    int[] d = mem.get(num + 1);
                    int newLength = d[2] + 1;
                    int[] newArr = new int[] {num, d[1], newLength};
                    mem.put(num, newArr);
                    mem.put(d[1], newArr);
                    if(newLength > longest) longest = newLength;
                } else if(!mem.containsKey(num + 1) && !mem.containsKey(num - 1)) { // isolated
                    mem.put(num, new int[] {num, num, 1});
                    if(1 > longest) longest = 1;
                } else { // connecting two sequences
                    int[] d1 = mem.get(num - 1);
                    int[] d2 = mem.get(num + 1);
                    mem.put(num, new int[] {0,0,0});
                    int min = d1[0];
                    int max = d2[1];
                    int[] l = mem.get(min);
                    int[] r = mem.get(max);
                    int newLength = l[2] + r[2] + 1;
                    int[] newArr = new int[] {l[0], r[1], newLength};
                    mem.put(min, newArr);
                    mem.put(max, newArr);
                    if(newLength > longest) longest = newLength;
                }

            }
        }

        return longest;
    }
}
