package com.improve10x.tdd.vani.sortanarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
//Sort an array of 0s, 1s and 2s
//        Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
//        Examples
//        Input: nums = [2,0,2,1,1,0]
//        Output: [0,0,1,1,2,2]
//        Input: nums = [2,0,1]
//        Output: [0,1,2]
//        Input: nums = [0]
//        Output: [0]

public class SortAnArrayTest {
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsZero(){
        SortAnArray sortAnArray = new SortAnArray();
        int[] zero = sortAnArray.findSortArray(null);
        assertArrayEquals(new int[]{0},zero);
    }
}
