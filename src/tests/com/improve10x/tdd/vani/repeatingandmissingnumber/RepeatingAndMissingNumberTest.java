package com.improve10x.tdd.vani.repeatingandmissingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//Find the repeating and missing numbers
//        Problem Statement: You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.
//        Example 1:
//        Input Format:  array[] = {3,1,2,5,3}
//        Result: {3,4)
//        Explanation: A = 3 , B = 4
//        Since 3 is appearing twice and 4 is missing
//        Example 2:
//        Input Format: array[] = {3,1,2,5,4,6,7,5}
//        Result: {5,8)
//        Explanation: A = 5 , B = 8
//        Since 5 is appearing twice and 8 is missing
public class RepeatingAndMissingNumberTest {
    RepeatingAndMissingNumber repeatingAndMissingNumber;

    @BeforeEach
    public void setUp(){
        repeatingAndMissingNumber = new RepeatingAndMissingNumber();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returns0(){
        int[] zero = repeatingAndMissingNumber.findRepeatingAndMissingNumber(null);
        assertArrayEquals(new int[]{0},zero);
    }
    @Test
    public void given0_returns0(){
        int[] zero = repeatingAndMissingNumber.findRepeatingAndMissingNumber(new int[]{0});
        assertArrayEquals(new int[]{0},zero);
    }



}
