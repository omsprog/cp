package com.omsprog.algorithms.leetcode.medium.maximizetheconfusionofanexam;

public class MaximizeTheConfusionOfAnExam {
    private boolean isValidWindow(int counterT, int counterF, int k) {
        boolean isCounterTBigger = counterT > counterF;
        if(isCounterTBigger)
            return counterF <= k;
        else
            return counterT <= k;
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maximum = 0;
        int left = 0, right = 0;
        int counterT = 0;
        int counterF = 0;
        while(right < answerKey.length()) {
            char cR = answerKey.charAt(right);
            if(cR == 'T')
                ++counterT;
            else
                ++counterF;
            while(!isValidWindow(counterT, counterF, k)) {
                char cL = answerKey.charAt(left);
                if(cL == 'T')
                    --counterT;
                else
                    --counterF;
                ++left;
            }
            maximum = Math.max(maximum, right - left + 1);
            ++right;
        }

        return maximum;
    }
}
