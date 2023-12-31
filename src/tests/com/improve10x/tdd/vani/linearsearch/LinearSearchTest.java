package com.improve10x.tdd.vani.linearsearch;

import org.junit.jupiter.api.BeforeEach;
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
    private LinearSearch linearSearch;
    @BeforeEach
    public void setUp(){
        linearSearch = new LinearSearch();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNullAnd1_returnsMinus1(){
        int value = linearSearch.find(null,1);
        assertEquals(-1,value);
    }
    @Test
    public void givenEmptyAnd1_returnsMinus1(){
        int value = linearSearch.find(new int[]{},1);
        assertEquals(-1,value);
    }
    @Test
    public void given0And1_returnsMinus1(){
        int value = linearSearch.find(new int[]{0},1);
        assertEquals(-1,value);
    }
    @Test
    public void given0And0_returns0(){
        int value = linearSearch.find(new int[]{0},0);
        assertEquals(0,value);
    }
    @Test
    public void given12And1_returns0(){
        int value = linearSearch.find(new int[]{1,2},1);
        assertEquals(0,value);
    }
    @Test
    public void given12And2_returns1(){
        int value = linearSearch.find(new int[]{1,2},2);
        assertEquals(1,value);
    }
    @Test
    public void given123And2_returns1(){
        int value = linearSearch.find(new int[]{1,2,3},2);
        assertEquals(1,value);
    }
    @Test
    public void given123And1_returns0(){
        int value = linearSearch.find(new int[]{1,2,3},1);
        assertEquals(0,value);
    }
    @Test
    public void given123And3_returns2(){
        int value = linearSearch.find(new int[]{1,2,3},3);
        assertEquals(2,value);
    }
    @Test
    public void given1234And2_returns1(){
        int value = linearSearch.find(new int[]{1,2,3,4},2);
        assertEquals(1,value);
    }
    @Test
    public void given1234And3_returns2(){
        int value = linearSearch.find(new int[]{1,2,3,4},3);
        assertEquals(2,value);
    }
    @Test
    public void given1234And1_returns0(){
        int value = linearSearch.find(new int[]{1,2,3,4},1);
        assertEquals(0,value);
    }
    @Test
    public void given1234And4_returns3(){
        int value = linearSearch.find(new int[]{1,2,3,4},4);
        assertEquals(3,value);
    }
    @Test
    public void integrationTest(){
        int value = linearSearch.find(new int[]{1,2,3,4,5},6);
        assertEquals(-1, value);
        int value1 = linearSearch.find(new int[]{1,2,3,4,5},0);
        assertEquals(-1, value1);
        int value2 = linearSearch.find(new int[]{1,2,3,4,5},3);
        assertEquals(2, value2);
        int value3 = linearSearch.find(new int[]{5,4,3,2,1},5);
        assertEquals(0, value3);
    }
}
