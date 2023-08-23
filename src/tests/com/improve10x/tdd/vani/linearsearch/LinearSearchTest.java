package com.improve10x.tdd.vani.linearsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Linear Search in C
//        Problem Statement: Given an array, and an element num the task is
//        to find if num is present in the given array or not. If present
//        print the index of the element or print -1.
//        Example 1:
//        Input: arr[]= 1 2 3 4 5, num = 3
//        Output: 2
//        Explanation: 3 is present in the 2nd index
//        Example 2:
//        Input: arr[]= 5 4 3 2 1, num = 5
//        Output: 0
//        Explanation: 5 is present in the 0th index

public class LinearSearchTest {
    @Test
    public void nothing(){}
    @Test
    public void givenNullAnd1_returnsMinus1(){
        LinearSearch linearSearch = new LinearSearch();
        int value = linearSearch.find(null,1);
        assertEquals(-1,value);
    }



}
