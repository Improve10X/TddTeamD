package com.improve10x.tdd.krishna.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationsTest {

    @Test
    public void nothing(){
    }
    //Combinations
//Create a function that takes a variable number of arguments, each argument representing the number of items in a group. The function should return the number of permutations (combinations) of choices you would have if you selected one item from each group.
//Examples
//combinations(2, 3) ➞ 6
//combinations(3, 7, 4) ➞ 84
//combinations(2, 3, 4, 5) ➞ 120
    @Test
    public void givenZeros_returnsAllZeros(){
        Combinations combinations = new Combinations();
        int allZeros = combinations.findCombination(new int[]{0, 0});
        assertEquals(0, allZeros);
    }
}
