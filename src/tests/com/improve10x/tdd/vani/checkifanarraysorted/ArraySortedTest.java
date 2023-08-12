package com.improve10x.tdd.vani.checkifanarraysorted;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Check if an Array is Sorted
//        Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
//        Note: Two consecutive equal values are considered to be sorted.
//        Examples
//        Example 1:
//        Input: N = 5, array[] = {1,2,3,4,5}
//        Output: True.
//        Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
//        Example 2:
//        Input: N = 5, array[] = {5,4,6,7,8}
//        Output: False.
//        Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
//        Here element 5 is not smaller than or equal to its future elements.

public class ArraySortedTest {
    ArraySorted arraySorted;
    @BeforeEach
    public void setUp(){
        arraySorted = new ArraySorted();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsTrue(){
        boolean statement = arraySorted.checkIfAnArraySorted(null);
        assertEquals(true,statement);
    }
    @Test
    public void givenEmpty_returnsTrue(){
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{});
        assertEquals(true,statement);
    }
    @Test
    public void given0_returnsTrue(){
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{0});
        assertEquals(true,statement);
    }
    @Test
    public void given01_returnsTrue(){
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{0,1});
        assertEquals(true,statement);
    }
    @Test
    public void given10_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{1, 0});
        assertEquals(false, statement);
    }
    @Test
    public void given12_returnsTrue() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{1, 2});
        assertEquals(true, statement);
    }
    @Test
    public void given21_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{2, 1});
        assertEquals(false, statement);
    }
    @Test
    public void given120_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{1,2,0});
        assertEquals(false, statement);
    }

    @Test
    public void given012_returnsTrue() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{0,1,2});
        assertEquals(true, statement);
    }

    @Test
    public void given102_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{1,0,2});
        assertEquals(false, statement);
    }
    @Test
    public void given210_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{2,1,0});
        assertEquals(false, statement);
    }
    @Test
    public void given021_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{0,2,1});
        assertEquals(false, statement);
    }
    @Test
    public void given201_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{2,0,1});
        assertEquals(false, statement);
    }
    @Test
    public void given0123_returnsTrue() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{0,1,2,3});
        assertEquals(true, statement);
    }
    @Test
    public void given1023_returnsFalse() {
        boolean statement = arraySorted.checkIfAnArraySorted(new int[]{1,0,2,3});
        assertEquals(true, statement);
    }



}
