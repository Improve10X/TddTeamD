package com.improve10x.tdd.vani.largestnumberinanarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Largest Number in an Array
//        Create a method that takes an array of integers. Return the largest integer in the array.
//        Examples
//        findLargestNum([4, 5, 1, 3]) ➞ 5
//        findLargestNum([300, 200, 600, 150]) ➞ 600
//        findLargestNum([1000, 1001, 857, 1]) ➞ 1001

public class LargestNumberInAnArrayTest {
    LargestNumberInAnArray LargestNumberInAnArray;

    @BeforeEach
    public void setUp(){
        LargestNumberInAnArray = new LargestNumberInAnArray();
    }

    @Test
    public void nothing(){}

    @Test
    public void given0_return0(){
        int zero = LargestNumberInAnArray.findLargestNum(new int[]{0});
        assertEquals(0, zero);
    }

    @Test
    public void givenNull_returns0(){
        int zero = LargestNumberInAnArray.findLargestNum(null);
        assertEquals(0,zero);
    }

    @Test
    public void givenZeros_returns0(){
        int zero = LargestNumberInAnArray.findLargestNum(new int[]{0,0,0,0,0});
        assertEquals(0,zero);
    }

    @Test
    public void given01_returns1(){
        int one = LargestNumberInAnArray.findLargestNum(new int[]{0,1});
        assertEquals(1,one);
    }

    @Test
    public void given10_returns1(){
        int one = LargestNumberInAnArray.findLargestNum(new int[]{1,0});
        assertEquals(1,one);
    }

    @Test
    public void given102_returns2(){
        int two = LargestNumberInAnArray.findLargestNum(new int[]{1,0,2});
        assertEquals(2,two);
    }

    @Test
    public void integrationTest(){
        int five = LargestNumberInAnArray.findLargestNum(new int[]{4,5,1,3});
        assertEquals(5,five);
        int sixHundred = LargestNumberInAnArray.findLargestNum(new int[]{300,200,600,150});
        assertEquals(600,sixHundred);
        int thousandOne = LargestNumberInAnArray.findLargestNum(new int[]{1000,1001,187,1});
        assertEquals(1001,thousandOne);

    }
}
