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
        int[] sorted = sorting.sortAnArray(new int[]{0});
        assertArrayEquals(new int[]{0}, sorted);
    }

    @Test
    public void given1_returns1(){
        Sorting sorting = new Sorting();
        int[] sorted = sorting.sortAnArray(new int[]{1});
        assertArrayEquals(new int[]{1}, sorted);
    }

    @Test
    public void givenMinusOne_returnsMinusOne(){
        Sorting sorting = new Sorting();
        int[] sorted = sorting.sortAnArray(new int[]{-1});
        assertArrayEquals(new int[]{-1}, sorted);
    }

    @Test
    public void given3_returnsMinusOne(){
        Sorting sorting = new Sorting();
        int[] sorted = sorting.sortAnArray(new int[]{3});
        assertArrayEquals(new int[]{-1}, sorted);
    }
}
