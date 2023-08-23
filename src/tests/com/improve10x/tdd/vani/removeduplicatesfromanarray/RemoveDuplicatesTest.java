package com.improve10x.tdd.vani.removeduplicatesfromanarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//Remove Duplicates in-place from Sorted Array
//        Problem Statement: Given an integer array sorted in non-decreasing order,
//        remove the duplicates in place such that each unique
//        element appears only once. The relative order of the elements
//        should be kept the same.
//        If there are k elements after removing the duplicates,
//        then the first k elements of the array should hold the final result.
//        It does not matter what you leave beyond the first k elements.
//        Note: Return k after placing the final result in the first k
//        slots of the array.
//        Examples
//        Example 1:
//        Input: arr[1,1,2,2,2,3,3]
//        Output: arr[1,2,3,_,_,_,_]
//        Explanation: Total number of unique elements are 3, i.e[1,2,3] and
//        Therefore return 3 after assigning [1,2,3] in the beginning of the array.
//        Example 2:
//        Input: arr[1,1,1,2,2,3,3,3,3,4,4]
//        Output: arr[1,2,3,4,_,_,_,_,_,_,_]
//        Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

public class RemoveDuplicatesTest {
    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    public void setUp(){
        removeDuplicates = new RemoveDuplicates();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmpty(){
        int[] value = removeDuplicates.find(null);
        assertArrayEquals(new int[]{}, value);
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        int[] value = removeDuplicates.find(new int[]{});
        assertArrayEquals(new int[]{}, value);
    }
    @Test
    public void given0_returns0(){
        int[] value = removeDuplicates.find(new int[]{0});
        assertArrayEquals(new int[]{0}, value);
    }
    @Test
    public void given2_returns2(){
        int[] value = removeDuplicates.find(new int[]{2});
        assertArrayEquals(new int[]{2}, value);
    }
    @Test
    public void given00_returns0(){
        int[] value = removeDuplicates.find(new int[]{0,0});
        assertArrayEquals(new int[]{0}, value);
    }
    @Test
    public void given01_returns01(){
        int[] value = removeDuplicates.find(new int[]{0,1});
        assertArrayEquals(new int[]{0,1}, value);
    }
    @Test
    public void given12_returns12(){
        int[] value = removeDuplicates.find(new int[]{1,2});
        assertArrayEquals(new int[]{1,2}, value);
    }
    @Test
    public void given111_returns1(){
        int[] value = removeDuplicates.find(new int[]{1,1,1});
        assertArrayEquals(new int[]{1}, value);
    }
    @Test
    public void given112_returns12(){
        int[] value = removeDuplicates.find(new int[]{1,1,2});
        assertArrayEquals(new int[]{1,2}, value);
    }
    @Test
    public void given122_returns12(){
        int[] value = removeDuplicates.find(new int[]{1,2,2});
        assertArrayEquals(new int[]{1,2}, value);
    }
    @Test
    public void given123_returns123(){
        int[] value = removeDuplicates.find(new int[]{1,2,3});
        assertArrayEquals(new int[]{1,2,3}, value);
    }
    @Test
    public void given2222_returns2(){
        int[] value = removeDuplicates.find(new int[]{2,2,2,2});
        assertArrayEquals(new int[]{2}, value);
    }
    @Test
    public void given1234_returns1234(){
        int[] value = removeDuplicates.find(new int[]{1,2,3,4});
        assertArrayEquals(new int[]{1,2,3,4}, value);
    }
    @Test
    public void given1122_returns12(){
        int[] value = removeDuplicates.find(new int[]{1,1,2,2});
        assertArrayEquals(new int[]{1,2}, value);
    }
    @Test
    public void given1123_returns123(){
        int[] value = removeDuplicates.find(new int[]{1,1,2,3});
        assertArrayEquals(new int[]{1,2,3}, value);
    }
    @Test
    public void given1223_returns123(){
        int[] value = removeDuplicates.find(new int[]{1,2,2,3});
        assertArrayEquals(new int[]{1,2,3}, value);
    }
    @Test
    public void given1233_returns123(){
        int[] value = removeDuplicates.find(new int[]{1,2,3,3});
        assertArrayEquals(new int[]{1,2,3}, value);
    }
    @Test
    public void integrationTest(){
        int[] value = removeDuplicates.find(new int[]{1,1,2,2,2,3,3});
        assertArrayEquals(new int[]{1,2,3}, value);
        int[] value1 = removeDuplicates.find(new int[]{1,1,1,2,2,3,3,3,3,4,4});
        assertArrayEquals(new int[]{1,2,3,4}, value1);
    }
}
