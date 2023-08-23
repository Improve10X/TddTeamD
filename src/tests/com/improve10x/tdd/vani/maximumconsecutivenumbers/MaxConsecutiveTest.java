package com.improve10x.tdd.vani.maximumconsecutivenumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//Count Maximum Consecutive One’s in the array
//        Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
//
//        Examples:
//
//        Example 1:
//
//        Input: prices = {1, 1, 0, 1, 1, 1}
//
//        Output: 3
//        Explanation: There are two consecutive 1’s and
//        three consecutive 1’s in the array out of which maximum is 3.
//        Input: prices = {1, 0, 1, 1, 0, 1}
//        Output: 2
//        Explanation: There are two consecutive 1's in the array.

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveTest {
    private MaxConsecutive maxConsecutive;
    @BeforeEach
    public void setUp(){
        maxConsecutive = new MaxConsecutive();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returns0(){
        int value = maxConsecutive.find(null);
        assertEquals(0,value);
    }
    @Test
    public void givenEmpty_returns0(){
        int value = maxConsecutive.find(new int[]{0});
        assertEquals(0,value);
    }

}
