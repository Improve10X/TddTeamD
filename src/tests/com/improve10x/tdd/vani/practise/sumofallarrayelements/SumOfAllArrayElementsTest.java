package com.improve10x.tdd.vani.practise.sumofallarrayelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Get the Sum of All Array Elements
//        Create a function that takes an array and returns the sum of all numbers in the array.
//        Examples
//        sum([2, 7, 4]) ➞ 13
//        sum([45, 3, 0]) ➞ 48
//        sum([-2, 84, 23]) ➞ 105


public class SumOfAllArrayElementsTest {
    SumOfAllArrayElements sumOfAllArrayElements;

    @BeforeEach
    public void setUp(){
        sumOfAllArrayElements = new SumOfAllArrayElements();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenZeros_returnsZero(){
        int zero = sumOfAllArrayElements.sum(new int[]{0,0,0});
        assertEquals(0,zero);
    }

    @Test
    public void givenOneOne_returnsTwo(){
        int two = sumOfAllArrayElements.sum(new int[]{1,1});
        assertEquals(2, two);
    }

    @Test
    public void givenTwoSevenFour_returnsThirteen(){
        int thirteen = sumOfAllArrayElements.sum(new int[]{2,7,4});
        assertEquals(13,thirteen);
    }

    @Test
    public void givenFortyFiveThree_returnsFortyEight(){
        int fortyEight = sumOfAllArrayElements.sum(new int[]{45,3,0});
        assertEquals(48, fortyEight);
    }

    @Test
    public void givenMinusTwoEightyFourTwentyThree_returnsOneZeroFive(){
        int value = sumOfAllArrayElements.sum(new int[]{-2,84,23});
        assertEquals(105,value);
    }
}
