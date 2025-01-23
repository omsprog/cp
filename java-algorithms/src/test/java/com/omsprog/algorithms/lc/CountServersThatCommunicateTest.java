package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountServersThatCommunicateTest {
    @Test
    void test() {
        CountServersThatCommunicate cS = new CountServersThatCommunicate();
        assertEquals(0, cS.countServers(new int[][] {{1,0},{0,1}}));
        assertEquals(3, cS.countServers(new int[][] {{1,0},{1,1}}));
        assertEquals(12, cS.countServers(new int[][] {  {0,0,1,0,1},
                                                        {0,1,0,1,0},
                                                        {0,1,1,1,0},
                                                        {1,0,0,1,1},
                                                        {0,0,1,1,0}}));
    }
}