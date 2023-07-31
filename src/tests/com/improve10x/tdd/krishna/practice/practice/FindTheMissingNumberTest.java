package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMissingNumberTest {

    @Test
    public void nothing(){
    }

//Find the Missing Number
//Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//Examples
//missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
//missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7
    @Test
    public void givenNull_returnsZero(){
        FindTheMissingNumber findTheMissingNumber = new FindTheMissingNumber();
        int result = findTheMissingNumber.findMissingNumber(null);
        assertEquals(0, result);
    }

    @Test
    public void givenZero_returnsZero(){
        FindTheMissingNumber findTheMissingNumber = new FindTheMissingNumber();
        int result = findTheMissingNumber.findMissingNumber(new int[0]);
        assertEquals(0, result);
    }
}
