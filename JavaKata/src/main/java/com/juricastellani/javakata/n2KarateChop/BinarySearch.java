package com.juricastellani.javakata.n2KarateChop;

import java.util.Arrays;

public class BinarySearch {
    public int chop(int element, int[] arrayOfInteger) {
        if(!Arrays.asList(arrayOfInteger).contains(element)) {
            return -1;
        }
        return 0;
    }
}
