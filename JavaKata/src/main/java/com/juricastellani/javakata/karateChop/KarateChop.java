package com.juricastellani.javakata.karateChop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KarateChop {

    public static Integer binarySearch(Collection<Integer> integerCollection, int item) {
        if(!integerCollection.contains(item)) {
            return null;
        }
        if(integerCollection.size()==1 && integerCollection.contains(item)) {
            return 0;
        }

        Integer middleIndex = integerCollection.size()/2;
        Collection<Integer> firstSubCollection = getSubCollection(integerCollection, 0, middleIndex);
        Collection<Integer> lastSubCollection = getSubCollection(integerCollection, middleIndex, integerCollection.size());
        if(firstSubCollection.contains(item)) {
            return KarateChop.binarySearch(firstSubCollection, item);
        } else {
            return middleIndex + KarateChop.binarySearch(lastSubCollection, item);
        }
    }

    private static Collection<Integer> getSubCollection(Collection<Integer> integerCollection, Integer firstIndexToConsider, Integer lastIndexToConsider) {
        List<Integer> collectionRelatedList = new ArrayList<Integer>(integerCollection);
        Collection<Integer> subCollection = new ArrayList<Integer>();
        for(Integer i=firstIndexToConsider; i<lastIndexToConsider; i++) {
            subCollection.add(collectionRelatedList.get(i));
        }
        return subCollection;
    }
}
