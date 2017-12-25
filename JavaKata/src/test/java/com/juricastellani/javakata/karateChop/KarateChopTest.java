package com.juricastellani.javakata.karateChop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class KarateChopTest {
    Collection<Integer> integerList;

    @Before
    public void init() throws Exception {
        integerList = new ArrayList<Integer>() {{
            add(1);
            add(4);
            add(5);
            add(7);
            add(10);
            add(12);
            add(13);
            add(16);
            add(18);
            add(19);
            add(20);
            add(21);
            add(24);
        }};

    }

    @After
    public void close() throws Exception {
        integerList = null;
    }

    @Test
    public void binarySearchTest_missingValue() throws Exception {
        Integer itemIndexExpected;
        Integer itemIndexActual;
        Integer item = 0;
        itemIndexActual = KarateChop.binarySearch(integerList, item);
        itemIndexExpected = null;
        assertThat(itemIndexActual, is(itemIndexExpected));
    }

    @Test
    public void binarySearchTest_existingValue1() throws Exception {
        Integer itemIndexExpected;
        Integer itemIndexActual;
        Integer item = 4;
        itemIndexActual = KarateChop.binarySearch(integerList, item);
        itemIndexExpected = 1;
        assertThat(itemIndexActual, is(itemIndexExpected));
    }

    @Test
    public void binarySearchTest_existingValue2() throws Exception {
        Integer itemIndexExpected;
        Integer itemIndexActual;
        Integer item = 12;
        itemIndexActual = KarateChop.binarySearch(integerList, item);
        itemIndexExpected = 5;
        assertThat(itemIndexActual, is(itemIndexExpected));
    }

    @Test
    public void binarySearchTest_existingValue3() throws Exception {
        Integer itemIndexExpected;
        Integer itemIndexActual;
        Integer item = 21;
        itemIndexActual = KarateChop.binarySearch(integerList, item);
        itemIndexExpected = 11;
        assertThat(itemIndexActual, is(itemIndexExpected));
    }

}
