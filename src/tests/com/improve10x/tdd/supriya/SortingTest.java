package com.improve10x.tdd.supriya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {
    @Test
    public void nothing(){}

    @Test
    public void given0_return0(){
        Sorting sorting = new Sorting();
        int[] sortingNumber = sorting.findNumber(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0},sortingNumber);
    }

    @Test
    public void given1_return0(){
        Sorting sorting = new Sorting();
        int[] sortingNumber = sorting.findNumber(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0},sortingNumber);
    }

    @Test
    public void given2_return0(){
        Sorting sorting = new Sorting();
        int[] sortingNumber = sorting.findNumber(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0},sortingNumber);
    }
}
