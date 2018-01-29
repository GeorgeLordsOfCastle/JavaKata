package com.juricastellani.javakata.n2KarateChop;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public int chop(Integer element, Integer[] arrayOfInteger) {
        List<Integer> integers = Arrays.asList(arrayOfInteger);
        if(integers.size()==0) {
            return -1;
        }
        if(integers.size()==1) {
            if(integers.get(0).equals(element)) {
                return 0;
            } else {
                return -1;
            }
        }

        int halfPosition = arrayOfInteger.length / 2;
        Integer[] leftSubArray = getSubArray(arrayOfInteger, 0, halfPosition);
        Integer[] rightSubArray = getSubArray(arrayOfInteger, halfPosition, arrayOfInteger.length);

        int isInLeftArrayIndex = chop(element, leftSubArray);
        if(isInLeftArrayIndex >=0) {
            return isInLeftArrayIndex;
        }
        int isInRightArrayIndex = chop(element, rightSubArray);
        if(isInRightArrayIndex >=0) {
            return halfPosition + isInRightArrayIndex;
        }

        return -1;
    }


    private Integer[] getSubArray(Integer[] arrayOfInteger, int firstIndex, int lastIndex) {
        List<Integer> integers = Arrays.asList(arrayOfInteger).subList(firstIndex, lastIndex);
        return integers.toArray(new Integer[integers.size()]);
    }
}
