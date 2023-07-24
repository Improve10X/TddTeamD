package com.improve10x.tdd.vani.practise.arraycontainsagivennumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Check if an Array Contains a Given Number
//        Write a function to check if an array contains a particular number.
//        Examples
//        check([1, 2, 3, 4, 5], 3) ➞ true
//        check([1, 1, 2, 1, 1], 3) ➞ false
//        check([5, 5, 5, 6], 5) ➞ true
//        check([], 5) ➞ false

public class ArrayContainsAGivenNumberTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZeros_returnsTrue(){
        ArrayContainsAGivenNumber arrayContainsAGivenNumber = new ArrayContainsAGivenNumber();
        boolean statement = arrayContainsAGivenNumber.check(new int[]{0,0,0,0,0},0);
        assertEquals(true, statement);
    }

}
