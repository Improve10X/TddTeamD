package com.improve10x.tdd.vani.majorityelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Majority Element that occurs more than N/2 times
//        Problem Statement: Given an array of N integers, write a program to
//        return an element that occurs more than N/2 times in the given array.
//        You may consider that such an element always exists in the array.
//        Examples
//        Example 1:
//        Input Format: N = 3, nums[] = {3,2,3}
//        Result: 3
//        Explanation: When we just count the occurrences of each number and
//        compare with half of the size of the array, you will get 3 for
//        the above solution.
//        Example 2:
//        Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
//        Result: 2
//        Explanation: After counting the number of times each element appears
//        and comparing it with half of array size, we get 2 as result.
//        Example 3:
//        Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
//        Result: 4

public class MajorityElementsTest {
    private MajorityElements majorityElements;
    @BeforeEach
    public void setUp(){
        majorityElements = new MajorityElements();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsMinus1(){
      int value = majorityElements.find(null);
      assertEquals(-1, value);
    }
    @Test
    public void givenEmpty_returnsMinus1(){
        int value = majorityElements.find(new int[]{});
        assertEquals(-1, value);
    }
    @Test
    public void given0_returns0(){
        int value = majorityElements.find(new int[]{0});
        assertEquals(0, value);
    }
    @Test
    public void given1_returns1(){
        int value = majorityElements.find(new int[]{1});
        assertEquals(1, value);
    }
    @Test
    public void given01_returnsMinus1(){
        int value = majorityElements.find(new int[]{0,1});
        assertEquals(-1, value);
    }
    @Test
    public void given12_returnsMinus1(){
        int value = majorityElements.find(new int[]{1,2});
        assertEquals(-1, value);
    }
    @Test
    public void given00_returns0(){
        int value = majorityElements.find(new int[]{0,0});
        assertEquals(0, value);
    }
    @Test
    public void given123_returnsMinus1(){
        int value = majorityElements.find(new int[]{1,2,3});
        assertEquals(-1, value);
    }
    @Test
    public void given112_returns1(){
        int value = majorityElements.find(new int[]{1,1,2});
        assertEquals(1, value);
    }
    @Test
    public void given121_returns1(){
        int value = majorityElements.find(new int[]{1,2,1});
        assertEquals(1, value);
    }
    @Test
    public void given111_returns1(){
        int value = majorityElements.find(new int[]{1,1,1});
        assertEquals(1, value);
    }
}
