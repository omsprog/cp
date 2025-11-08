package com.omsprog.algorithms.leetcode.easy.studentattendancerecordi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAttendanceRecordITest {
    @Test
    void test() {
        StudentAttendanceRecordI sAR = new StudentAttendanceRecordI();
        assertTrue(sAR.checkRecord("PPALLP"));
        assertFalse(sAR.checkRecord("PPALLL"));
    }
}