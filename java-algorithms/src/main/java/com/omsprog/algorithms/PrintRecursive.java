package com.omsprog.algorithms;

public class PrintRecursive {

    public static void printRec(int[] integers, int length) {
        if(length == 0) {
            return;
        }
        printRec(integers, length-1);
        System.out.println(integers[length-1]);
    }

    public static void printRecursive(int[] integers) {
        printRec(integers, integers.length);
    }

    public static void printRecBack(int[] integers, int length) {
        /*
        if(length == integers.length) {
            return;
        }
        printRecBack(integers, length + 1);
        System.out.println(integers[length]);
         */
        if(length == 0) {
            return;
        }
        System.out.println(integers[length-1]);
        printRecBack(integers, length-1);
    }

    public static void printRecursiveBackwards(int[] integers) {
        printRecBack(integers, integers.length);
    }

    public static void main(String[] args) {
        PrintRecursive.printRecursiveBackwards(new int[]{1,2,3,4,5,6});
        //PrintRecursive.printRecursive(new int[]{1,2,3,4,5,6});
    }
}
