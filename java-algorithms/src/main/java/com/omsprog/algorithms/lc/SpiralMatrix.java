package com.omsprog.algorithms.lc;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arrayInSpiral = new ArrayList<>();
        int offsetL = 0, offsetR = 0, offsetU = 0, offsetD = 0;
        int yLength = matrix.length, xLength = matrix[0].length;
        int elementsToBeProcessed = xLength * yLength;
        int currentX = 0, currentY = 0;

        while(true) {
            // right
            for(int i = offsetL; i < xLength - offsetR; i++) {
                currentX = i;
                arrayInSpiral.add(matrix[currentY][currentX]);
            }
            ++offsetU;
            if(elementsToBeProcessed == arrayInSpiral.size())
                break;

            // down
            for(int i = offsetU; i < yLength - offsetD; i++) {
                currentY = i;
                arrayInSpiral.add(matrix[currentY][currentX]);
            }
            ++offsetR;
            if(elementsToBeProcessed == arrayInSpiral.size())
                break;

            // left
            for(int i = xLength - offsetR - 1; i >= offsetL; i--) {
                currentX = i;
                arrayInSpiral.add(matrix[currentY][currentX]);
            }
            ++offsetD;
            if(elementsToBeProcessed == arrayInSpiral.size())
                break;

            // up
            for(int i = yLength - offsetD - 1; i >= offsetU; i--) {
                currentY = i;
                arrayInSpiral.add(matrix[currentY][currentX]);
            }
            ++offsetL;
            if(elementsToBeProcessed == arrayInSpiral.size())
                break;
        }

        return arrayInSpiral;
    }
}
