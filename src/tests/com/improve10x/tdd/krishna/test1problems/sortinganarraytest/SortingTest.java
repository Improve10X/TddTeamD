package com.improve10x.tdd.krishna.test1problems.sortinganarraytest;

import com.improve10x.tdd.krishna.test1problems.sortinganarray.Sorting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingTest {

    Sorting sorting;

    @BeforeEach
    public void setup() {
        sorting = new Sorting();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void given0_returns0() {
        int[] sorted = sorting.sortAnArray(new int[]{0});
        assertArrayEquals(new int[]{0}, sorted);
    }

    @Test
    public void given1_returns1() {
        int[] sorted = sorting.sortAnArray(new int[]{1});
        assertArrayEquals(new int[]{1}, sorted);
    }

    @Test
    public void givenMinusOne_returnsMinusOne() {
        int[] sorted = sorting.sortAnArray(new int[]{-1});
        assertArrayEquals(new int[]{-1}, sorted);
    }

    @Test
    public void given3_returnsMinusOne() {
        int[] sorted = sorting.sortAnArray(new int[]{3});
        assertArrayEquals(new int[]{-1}, sorted);
    }

    @Test
    public void given012_returns012() {
        int[] sorted = sorting.sortAnArray(new int[]{0, 1, 2});
        assertArrayEquals(new int[]{0, 1, 2}, sorted);
    }

    @Test
    public void given102_returns012() {
        int[] sorted = sorting.sortAnArray(new int[]{1, 0, 2});
        assertArrayEquals(new int[]{0, 1, 2}, sorted);
    }

    @Test
    public void given120_returns012() {
        int[] sorted = sorting.sortAnArray(new int[]{1, 2, 0});
        assertArrayEquals(new int[]{0, 1, 2}, sorted);
    }

   @Disabled
    @Test
    public void given1203_returnsMinusOne() {
        int[] sorted = sorting.sortAnArray(new int[]{1, 2, 0, 3});
        assertArrayEquals(new int[]{-1}, sorted);
    }

    @Test
    public void given12345_returnsMinusOne() {
        int[] sorted = sorting.sortAnArray(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{-1}, sorted);
    }

    @Test
    public void given202110_returns001122() {
        int[] sorted = sorting.sortAnArray(new int[]{2, 0, 2, 1, 1, 0});
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sorted);
    }
}
