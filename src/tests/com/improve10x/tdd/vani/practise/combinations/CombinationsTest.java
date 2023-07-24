package com.improve10x.tdd.vani.practise.combinations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Combinations
//        Create a function that takes a variable number of arguments, each argument representing the number of items in a group. The function should return the number of permutations (combinations) of choices you would have if you selected one item from each group.
//        Examples
//        combinations(2, 3) ➞ 6
//        combinations(3, 7, 4) ➞ 84
//        combinations(2, 3, 4, 5) ➞ 120

public class CombinationsTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZeros_returnsZero(){
        Combinations combinations = new Combinations();
        int empty = combinations.combination(new int[]{0,0});
        assertEquals(0,empty);
    }


}
