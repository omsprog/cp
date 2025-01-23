package com.omsprog.algorithms.lc;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int nOfIslands = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    ++nOfIslands;
                    // process BFS
                    Queue<int[]> queue = new LinkedList<>();
                    grid[i][j] = '0';
                    queue.add(new int[] {i, j});

                    while(!queue.isEmpty()) {
                        int[] currentNode = queue.poll();
                        int currentX = currentNode[0];
                        int currentY = currentNode[1];
                        // up
                        if(currentX - 1 >= 0 && grid[currentX-1][currentY] == '1') {
                            queue.add(new int[] {currentX -1, currentY});
                            grid[currentX-1][currentY] = '0';
                        }
                        // right
                        if(currentY + 1 < grid[currentX].length && grid[currentX][currentY + 1] == '1') {
                            queue.add(new int[] {currentX, currentY + 1});
                            grid[currentX][currentY+1] = '0';
                        }
                        // down
                        if(currentX + 1 < grid.length && grid[currentX + 1][currentY] == '1') {
                            queue.add(new int[] {currentX + 1, currentY});
                            grid[currentX + 1][currentY] = '0';
                        }
                        // left
                        if(currentY - 1 >= 0 && grid[currentX][currentY-1] == '1') {
                            queue.add(new int[] {currentX, currentY-1});
                            grid[currentX][currentY-1] = '0';
                        }
                    }
                }
            }
        }

        return nOfIslands;
    }
}
