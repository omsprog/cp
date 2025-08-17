package com.omsprog.algorithms.leetcode.medium.camelcasematching;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CamelcaseMatchingTest {
    @Test
    void test() {
        CamelcaseMatching camelcaseMatching = new CamelcaseMatching();
        assertEquals(List.of(true,false,true,true,false), camelcaseMatching.camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"},
                "FB"
        ));

        assertEquals(List.of(true,false,true,false,false), camelcaseMatching.camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"},
                "FoBa"
        ));

        assertEquals(List.of(false,true,false,false,false), camelcaseMatching.camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"},
                "FoBaT"
        ));
    }
}