package com.juricastellani.javakata.n2KarateChop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @Before
    public void init() throws Exception {
        binarySearch = new BinarySearch();
    }

    @After
    public void close() throws Exception {
        binarySearch = null;
    }

    @Test
    public void searchTest() throws Exception {
        assertThat(binarySearch.chop(3, new Integer[]{}), is(-1));
        assertThat(binarySearch.chop(3, new Integer[]{1}), is(-1));
        assertThat(binarySearch.chop(1, new Integer[]{1}), is(0));

        assertThat(binarySearch.chop(1, new Integer[]{1, 3, 5}), is(0));
        assertThat(binarySearch.chop(3, new Integer[]{1, 3, 5}), is(1));
        assertThat(binarySearch.chop(5, new Integer[]{1, 3, 5}), is(2));
        assertThat(binarySearch.chop(0, new Integer[]{1, 3, 5}), is(-1));
        assertThat(binarySearch.chop(2, new Integer[]{1, 3, 5}), is(-1));
        assertThat(binarySearch.chop(4, new Integer[]{1, 3, 5}), is(-1));
        assertThat(binarySearch.chop(6, new Integer[]{1, 3, 5}), is(-1));

        assertThat(binarySearch.chop(1, new Integer[]{1, 3, 5, 7}), is(0));
        assertThat(binarySearch.chop(3, new Integer[]{1, 3, 5, 7}), is(1));
        assertThat(binarySearch.chop(5, new Integer[]{1, 3, 5, 7}), is(2));
        assertThat(binarySearch.chop(7, new Integer[]{1, 3, 5, 7}), is(3));
        assertThat(binarySearch.chop(0, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(binarySearch.chop(2, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(binarySearch.chop(4, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(binarySearch.chop(6, new Integer[]{1, 3, 5, 7}), is(-1));
        assertThat(binarySearch.chop(8, new Integer[]{1, 3, 5, 7}), is(-1));
    }
}
