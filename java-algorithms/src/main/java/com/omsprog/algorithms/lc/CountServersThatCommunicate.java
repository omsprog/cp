package com.omsprog.algorithms.lc;

import java.util.LinkedList;
import java.util.Queue;

public class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int numberOfServers =  0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    Queue<int[]> queue = new LinkedList<>();
                    grid[i][j] = 0;
                    queue.add(new int[] {i, j});
                    boolean hasAtLeastOneConnection = false;

                    while(!queue.isEmpty()) {
                        int[] currentNode = queue.poll();

                        // right
                        for(int x = 0; x < grid[i].length; x++) {
                            if(grid[currentNode[0]][x] == 1) {
                                grid[currentNode[0]][x] = 0;
                                hasAtLeastOneConnection = true;
                                ++numberOfServers;
                                queue.add(new int[] {currentNode[0], x});
                            }
                        }

                        // down
                        for(int y = 0; y < grid.length; y++) {
                            if(grid[y][currentNode[1]] == 1) {
                                grid[y][currentNode[1]] = 0;
                                hasAtLeastOneConnection = true;
                                ++numberOfServers;
                                queue.add(new int[] {y, currentNode[1]});
                            }
                        }
                    }

                    if(hasAtLeastOneConnection)
                        ++numberOfServers;
                }
            }
        }

        return numberOfServers;
    }
}
