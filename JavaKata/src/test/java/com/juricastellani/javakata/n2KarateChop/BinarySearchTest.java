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
        assertThat(binarySearch.chop(3, new int[]{}), is(-1));
    }
}
