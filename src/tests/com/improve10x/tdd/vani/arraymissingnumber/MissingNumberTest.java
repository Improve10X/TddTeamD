package com.improve10x.tdd.vani.arraymissingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the missing number in an array
//        Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.
//        Examples
//        Example 1:
//        Input Format: N = 5, array[] = {1,2,4,5}
//        Result: 3
//        Example 2:
//        Input Format: N = 3, array[] = {1,3}
//        Result: 2

public class MissingNumberTest {
     private final int invalid = -1;
    MissingNumber missingNumber;
    @BeforeEach
    public void setUp(){
        missingNumber = new MissingNumber();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsInvalid(){
        int missingValue = missingNumber.find(null);
        assertEquals(invalid,missingValue);
    }
    @Test
    public void givenEmpty_returnsInvalid(){
        int missingValue = missingNumber.find(new int[]{});
        assertEquals(invalid,missingValue);
    }
    @Test
    public void given0_returnsInvalid(){
        int missingValue = missingNumber.find(new int[]{0});
        assertEquals(invalid,missingValue);
    }
    @Test
    public void given1_returns0(){
        int missingValue = missingNumber.find(new int[]{1});
        assertEquals(0,missingValue);
    }




}
