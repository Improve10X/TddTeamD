package com.improve10x.tdd.supriya.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Combinations
//        Create a function that takes a variable number of arguments, each argument representing the number of items in a group. The function should return the number of permutations (combinations) of choices you would have if you selected one item from each group.
//
//        Examples
//        combinations(2, 3) ➞ 6
//
//        combinations(3, 7, 4) ➞ 84
//
//        combinations(2, 3, 4, 5) ➞ 120

public class CombinationTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenZeroZero_returnsZero(){
        Combination combination = new Combination();
        int numbers = combination.findCombination(new int[]{0,0});
        assertEquals(0,numbers);
    }

    @Test
    public void givenOneZero_returnsZero(){
        Combination combination = new Combination();
        int numbers = combination.findCombination(new int[]{0,1});
        assertEquals(0, numbers);
    }
}
