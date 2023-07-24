package com.improve10x.tdd.vani.practise.sumofallarrayelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Get the Sum of All Array Elements
//        Create a function that takes an array and returns the sum of all numbers in the array.
//        Examples
//        sum([2, 7, 4]) ➞ 13
//        sum([45, 3, 0]) ➞ 48
//        sum([-2, 84, 23]) ➞ 105


public class SumOfAllArrayElementsTest {
    @Test
    public void nothing(){}
    @Test
    public void givenZeros_returnsZero(){
        SumOfAllArrayElements sumOfAllArrayElements = new SumOfAllArrayElements();
        int zero = sumOfAllArrayElements.sum(new int[]{0,0,0});
        assertEquals(0,zero);
    }

}
