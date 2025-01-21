package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    void findDisappearedNumbers() {
        FindAllNumbersDisappearedInAnArray fA = new FindAllNumbersDisappearedInAnArray();
        fA.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
    }
}