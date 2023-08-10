package com.improve10x.tdd.vani.findthelargestnumberinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Largest Number in an Array
//        Create a method that takes an array of integers. Return the largest integer in the array.
//        Examples
//        findLargestNum([4, 5, 1, 3]) ➞ 5
//        findLargestNum([300, 200, 600, 150]) ➞ 600
//        findLargestNum([1000, 1001, 857, 1]) ➞ 1001

public class FindTheLargestNumberInAnArrayTest {
    @Test
    public void nothing(){}

    @Test
    public void given0_return0(){
        FindTheLargestNumberInAnArray findTheLargestNumberInAnArray = new FindTheLargestNumberInAnArray();
        int zero = findTheLargestNumberInAnArray.findLargestNum(new int[]{0});
        assertEquals(0, zero);
    }
}
