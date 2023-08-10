package com.improve10x.tdd.krishna.sortinganarraytest;

import com.improve10x.tdd.krishna.sortinganarray.Sorting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingTest {

    @Test
    public void nothing(){
    }

    @Test
    public void given0_returns0(){
        Sorting sorting = new Sorting();
        int[] sorted = sorting.sortAnArray(new int[0]);
        assertArrayEquals(new int[0], sorted);
    }
}
