package com.improve10x.tdd.vani.practise.arraycontainsagivennumber;

import org.junit.jupiter.api.BeforeEach;
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
    ArrayContainsAGivenNumber arrayContainsAGivenNumber;

    @BeforeEach
    public void setUp() {
        arrayContainsAGivenNumber = new ArrayContainsAGivenNumber();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZeros_returnsTrue() {
        boolean statement = arrayContainsAGivenNumber.check(new int[]{0, 0, 0, 0, 0}, 0);
        assertEquals(true, statement);
    }

    @Test
    public void givenNumbers_returnsFalse() {
        boolean  statement = arrayContainsAGivenNumber.check(new int[]{1,2,3,4,5},6);
        assertEquals(false, statement);
    }

}
