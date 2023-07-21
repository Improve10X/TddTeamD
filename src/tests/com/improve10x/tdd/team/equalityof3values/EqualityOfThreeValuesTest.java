package com.improve10x.tdd.team.equalityof3values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualityOfThreeValuesTest {

    @Test
    public void nothing(){
    }
    //Equality of 3 Values
//Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.
//Examples
//equal(3, 4, 3) ➞ 2
//equal(1, 1, 1) ➞ 3
//equal(3, 4, 1) ➞ 0
    @Test
    public void givenThreeFourThree_returnsTwo(){
        EqualityOfThreeValues equalityOfThreeValues = new EqualityOfThreeValues();
        int result = equalityOfThreeValues.findEquality(3, 4, 3);
        assertEquals(2,result);
    }
}
