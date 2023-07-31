package com.improve10x.tdd.vani.findthemissingnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Missing Number
//        Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//        Examples
//        missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//        missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
//        missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

public class FindTheMissingNumberTest {
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returns0(){
        FindTheMissingNumber findTheMissingNumber = new FindTheMissingNumber();
        int number = findTheMissingNumber.missingNumber(null);
        assertEquals(0,number);

    }

}
