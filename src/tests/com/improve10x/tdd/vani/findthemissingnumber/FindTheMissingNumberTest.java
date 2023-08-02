package com.improve10x.tdd.vani.findthemissingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Missing Number
//        Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//        Examples
//        missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//        missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
//        missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

public class FindTheMissingNumberTest {
    MissingNumber missingNumber;
    @BeforeEach
    public void setUp(){
        missingNumber = new MissingNumber();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsMinusOne(){
        int number = missingNumber.findMissingNumber(null);
        assertEquals(-1,number);
    }
    @Test
    public void givenOneThree_returnsMinusOne(){
        int number = missingNumber.findMissingNumber(new int[]{1,3});
        assertEquals(-1,number);
    }

    @Test
    public void givenNumbers1To10_returnsMinusOne(){
        int number = missingNumber.findMissingNumber(new int[]{1,2,3,4,5,6,7,8,9,10});
        assertEquals(-1,number);
    }
    @Test
    public void givenNumbers_returnsMinus1(){
        int number = missingNumber.findMissingNumber(new int[]{1,2,3,5});
        assertEquals(-1,number);
    }

    @Test
    public void givenIntegers_returnsMinus1(){
        int number = missingNumber.findMissingNumber(new int[]{1,3,5});
        assertEquals(-1,number);
    }
    @Test
    public void integrationTest(){
        int number = missingNumber.findMissingNumber(new int[]{1,2,3,4,6,7,8,9,10});
        assertEquals(5,number);
        int number1 = missingNumber.findMissingNumber(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8});
        assertEquals(10,number1);
        int number2 = missingNumber.findMissingNumber(new int[]{10, 5, 1, 2, 4, 6, 8, 3, 9});
        assertEquals(7,number2);
    }
}
