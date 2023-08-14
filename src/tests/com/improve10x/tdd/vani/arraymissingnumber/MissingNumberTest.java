package com.improve10x.tdd.vani.arraymissingnumber;

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
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsInvalid(){
        MissingNumber missingNumber = new MissingNumber();
        int missingValue = missingNumber.find(null);
        assertEquals(-1,missingValue);
    }



}
