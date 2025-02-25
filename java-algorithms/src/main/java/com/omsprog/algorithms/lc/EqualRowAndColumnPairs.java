package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        for(int r = 0; r < grid.length; r++) {
            StringBuilder sb = new StringBuilder();
            for(int c = 0; c < grid[r].length; c++) {
                sb.append(grid[r][c]).append("-");
            }
            String st = sb.toString();
            if(map.containsKey(st)) {
                int oc = map.get(st);
                map.put(st, ++oc);
            } else
                map.put(st, 1);
        }

        int num = 0;


        for(int j = 0; j < grid.length; j++) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < grid[j].length; i++) {
                sb.append(grid[i][j]).append("-");
            }
            String s = sb.toString();
            if(map.containsKey(s)) {
                int o = map.get(s);
                num = num + o;
            }
        }

        return num;
    }
}
