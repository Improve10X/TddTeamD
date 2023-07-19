package com.improve10x.tdd.krishna.equalityof3valuestest;

import com.improve10x.tdd.krishna.equalityof3values.EqualityOf3Values;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualityOf3ValuesTest {

    EqualityOf3Values equalityOf3Values;

    @BeforeEach
    public void setup(){
        equalityOf3Values = new EqualityOf3Values();
    }

//Equality of 3 Values
//Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.
//Examples
//equal(3, 4, 3) ➞ 2
//equal(1, 1, 1) ➞ 3
//equal(3, 4, 1) ➞ 0

    @Test
    public void givenThreeFourThree_returnTwo(){
        int equality = equalityOf3Values.findEqualityOf3Values(3, 4, 3);
        assertEquals(2, equality);
    }

    @Test
    public void givenOneOneOne_returnThree(){
        int equality = equalityOf3Values.findEqualityOf3Values(1, 1, 1);
        assertEquals(3, equality);
    }

    @Test
    public void givenThreeFourOne_returnZero(){
        int equality = equalityOf3Values.findEqualityOf3Values(3, 4, 1);
        assertEquals(0, equality);
    }
}
