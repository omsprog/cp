package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConnectFourTest {
    @Test
    void printMatrixTest() {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));

        ConnectFour.whoIsWinner(myList);
    }

    @Test
    public void firstTest()
    {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        System.out.println(ConnectFour.whoIsWinner(myList));
        assertEquals("Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void secondTest()
    {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "C_Yellow",
                "E_Red",
                "G_Yellow",
                "B_Red",
                "D_Yellow",
                "B_Red",
                "B_Yellow",
                "G_Red",
                "C_Yellow",
                "C_Red",
                "D_Yellow",
                "F_Red",
                "E_Yellow",
                "A_Red",
                "A_Yellow",
                "G_Red",
                "A_Yellow",
                "F_Red",
                "F_Yellow",
                "D_Red",
                "B_Yellow",
                "E_Red",
                "D_Yellow",
                "A_Red",
                "G_Yellow"
        ));
        assertEquals("Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void thirdTest()
    {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "E_Yellow",
                "B_Red",
                "B_Yellow",
                "C_Red",
                "G_Yellow",
                "C_Red",
                "C_Yellow",
                "D_Red",
                "G_Yellow",
                "D_Red",
                "G_Yellow",
                "G_Red",
                "D_Yellow",
                "G_Red",
                "D_Yellow",
                "B_Red",
                "C_Yellow",
                "G_Red",
                "F_Yellow",
                "F_Red",
                "E_Yellow"
        ));
        assertEquals( "Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void fourthTest()
    {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "D_Yellow",
                "A_Red",
                "E_Yellow",
                "A_Red",
                "F_Yellow",
                "A_Red",
                "G_Yellow",
                "B_Red"
        ));
        assertEquals( "Yellow", ConnectFour.whoIsWinner(myList));
    }
}