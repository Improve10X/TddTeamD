package com.improve10x.tdd.vani.practise.combinations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Combinations
//        Create a function that takes a variable number of arguments, each argument representing the number of items in a group. The function should return the number of permutations (combinations) of choices you would have if you selected one item from each group.
//        Examples
//        combinations(2, 3) ➞ 6
//        combinations(3, 7, 4) ➞ 84
//        combinations(2, 3, 4, 5) ➞ 120

public class CombinationsTest {
    Combinations combinations;

    @BeforeEach
    public void setUp(){
        combinations = new Combinations();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenZeros_returnsZero(){
        int zero = combinations.combination(new int[]{0,0});
        assertEquals(0,zero);
    }

    @Test
    public void givenOneZero_returnsZero(){
        int zero = combinations.combination(new int[]{1,0});
        assertEquals(0,zero);
    }

    @Test
    public void givenOneOne_returnsOne(){
        int one = combinations.combination(new int[]{1,1});
        assertEquals(1,one);
    }

    @Test
    public void givenTwoThree_returnsSix(){
        int six = combinations.combination(new int[]{2,3});
        assertEquals(6,six);
    }

    @Test
    public void givenThreeSevenFour_returnsEightyFour(){
        int eightyFour = combinations.combination(new int[]{3,7,4});
        assertEquals(84, eightyFour);
    }

    @Test
    public void givenTwoThreeFourFive_returnsOneTwenty(){
        int oneTwenty = combinations.combination(new int[]{2,3,4,5});
        assertEquals(120, oneTwenty);
    }
}
