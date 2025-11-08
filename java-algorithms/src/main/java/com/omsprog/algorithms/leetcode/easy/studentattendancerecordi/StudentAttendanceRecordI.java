package com.omsprog.algorithms.leetcode.easy.studentattendancerecordi;

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int absentCounter = 0;
        int lateCounter = 0;

        for(char c : s.toCharArray()) {
            if(c == 'A') ++absentCounter;
            if(absentCounter == 2) return false;
            if(c == 'L')
                ++lateCounter;
            else
                lateCounter = 0;
            if(lateCounter == 3) return false;
        }
        return true;
    }
}
