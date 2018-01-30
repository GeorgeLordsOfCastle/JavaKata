package com.juricastellani.javakata.n2KarateChop;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    @Before
    public void init() {
        new BinarySearch();
    }

    @Test
    public void searchTest() throws Exception {
        assertThat(BinarySearch.chop(3, new Integer[]{}), is(-1));
        assertThat(BinarySearch.chop(3, new Integer[]{1}), is(-1));
        assertThat(BinarySearch.chop(1, new Integer[]{1}), is(0));

        assertThat(BinarySearch.chop(1, new Integer[]{1, 3, 5}), is(0));
        assertThat(BinarySearch.chop(3, new Integer[]{1, 3, 5}), is(1));
        assertThat(BinarySearch.chop(5, new Integer[]{1, 3, 5}), is(2));
        assertThat(BinarySearch.chop(0, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop(2, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop(4, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop(6, new Integer[]{1, 3, 5}), is(-1));

        assertThat(BinarySearch.chop(1, new Integer[]{1, 3, 5, 7}), is(0));
        assertThat(BinarySearch.chop(3, new Integer[]{1, 3, 5, 7}), is(1));
        assertThat(BinarySearch.chop(5, new Integer[]{1, 3, 5, 7}), is(2));
        assertThat(BinarySearch.chop(7, new Integer[]{1, 3, 5, 7}), is(3));
        assertThat(BinarySearch.chop(0, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop(2, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop(4, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop(6, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop(8, new Integer[]{1, 3, 5, 7}), is(-1));
    }

    @Test
    public void searchTest1() throws Exception {
        assertThat(BinarySearch.chop1(3, new Integer[]{}), is(-1));
        assertThat(BinarySearch.chop1(3, new Integer[]{1}), is(-1));
        assertThat(BinarySearch.chop1(1, new Integer[]{1}), is(0));

        assertThat(BinarySearch.chop1(1, new Integer[]{1, 3, 5}), is(0));
        assertThat(BinarySearch.chop1(3, new Integer[]{1, 3, 5}), is(1));
        assertThat(BinarySearch.chop1(5, new Integer[]{1, 3, 5}), is(2));
        assertThat(BinarySearch.chop1(0, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop1(2, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop1(4, new Integer[]{1, 3, 5}), is(-1));
        assertThat(BinarySearch.chop1(6, new Integer[]{1, 3, 5}), is(-1));

        assertThat(BinarySearch.chop1(1, new Integer[]{1, 3, 5, 7}), is(0));
        assertThat(BinarySearch.chop1(3, new Integer[]{1, 3, 5, 7}), is(1));
        assertThat(BinarySearch.chop1(5, new Integer[]{1, 3, 5, 7}), is(2));
        assertThat(BinarySearch.chop1(7, new Integer[]{1, 3, 5, 7}), is(3));
        assertThat(BinarySearch.chop1(0, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop1(2, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop1(4, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop1(6, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(BinarySearch.chop1(8, new Integer[]{1, 3, 5, 7}), is(-1));
    }
}
