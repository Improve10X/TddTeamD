package com.improve10x.tdd.supriya.findthemissingletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//Find the Missing Number
//        Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//        Examples
//        missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//        missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
//        missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

public class MissingNumberTest {
    MissingNumber missingNumber;
    @BeforeEach
    public void setUp(){
        missingNumber = new MissingNumber();

    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnMinusOne(){
        int giveNull = MissingNumber.findTheMissingNumber(null);
        Assertions.assertEquals(-1, giveNull);
    }

    @Test
    public void givenZero_returnMinusOne(){
        int giveZero = MissingNumber.findTheMissingNumber(new int[]{0});
        Assertions.assertEquals(-1, giveZero);
    }

    @Test
    public void givenOneThree_returnMinusOne(){
        int oneThree = MissingNumber.findTheMissingNumber(new int[]{1,3});
        Assertions.assertEquals(-1,oneThree );
    }
    @Test
    public void givenNumbers_return5(){
        int number = MissingNumber.findTheMissingNumber(new int[]{1,2,3,4,6,7,8,9,10});
        Assertions.assertEquals(5,number);
    }

    @Test
    public void givenNumbers1To10_returnMinusOne(){
        int number = MissingNumber.findTheMissingNumber(new int[]{1,2,3,4,5,6,7,8,9,10});
        Assertions.assertEquals(-1,number);
    }

    @Test
    public void integrationTest(){
        int number = MissingNumber.findTheMissingNumber(new int[]{1,2,3,4,6,7,8,9,10});
        Assertions.assertEquals(5,number);
        int number1 = MissingNumber.findTheMissingNumber(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8});
        Assertions.assertEquals(10,number1);
        int number2 = MissingNumber.findTheMissingNumber(new int[]{10, 5, 1, 2, 4, 6, 8, 3, 9});
        Assertions.assertEquals(7,number2);
    }
}
