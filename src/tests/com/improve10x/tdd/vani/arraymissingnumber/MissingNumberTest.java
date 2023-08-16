package com.improve10x.tdd.vani.arraymissingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the missing number in an array
//        Problem Statement: Given an integer N and an array of size N-1
//        containing N-1 numbers between 1 to N. Find the
//        number(between 1 to N), that is not present in the given array.
//        Examples
//        Example 1:
//        Input Format: N = 5, array[] = {1,2,4,5}
//        Result: 3
//        Example 2:
//        Input Format: N = 3, array[] = {1,3}
//        Result: 2

public class MissingNumberTest {
    private final int invalid = -1;
    private MissingNumber missingNumber;

    @BeforeEach
    public void setUp() {
        missingNumber = new MissingNumber();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsInvalid() {
        int missingValue = missingNumber.find(null);
        assertEquals(invalid, missingValue);
    }

    @Test
    public void givenEmpty_returnsInvalid() {
        int missingValue = missingNumber.find(new int[]{});
        assertEquals(invalid, missingValue);
    }

    @Test
    public void given0_returnsInvalid() {
        int missingValue = missingNumber.find(new int[]{0});
        assertEquals(invalid, missingValue);
    }

    @Test
    public void given1_returns2() {
        int missingValue = missingNumber.find(new int[]{1});
        assertEquals(2, missingValue);
    }

    @Test
    public void given2_returns1() {
        int missingValue = missingNumber.find(new int[]{2});
        assertEquals(1, missingValue);
    }

    @Test
    public void given13_returns2() {
        int missingValue = missingNumber.find(new int[]{1, 3});
        assertEquals(2, missingValue);
    }
    @Test
    public void given12_returns3() {
        int missingValue = missingNumber.find(new int[]{1, 2});
        assertEquals(3, missingValue);
    }
    @Test
    public void given23_returns1() {
        int missingValue = missingNumber.find(new int[]{2, 3});
        assertEquals(1, missingValue);
    }
    @Test
    public void given124_returns3() {
        int missingValue = missingNumber.find(new int[]{1, 2, 4});
        assertEquals(3, missingValue);
    }
    @Test
    public void given123_returns4() {
        int missingValue = missingNumber.find(new int[]{1, 2, 3});
        assertEquals(4, missingValue);
    }
    @Test
    public void given234_returns1() {
        int missingValue = missingNumber.find(new int[]{2,3,4});
        assertEquals(1, missingValue);
    }
    @Test
    public void given134_returns2() {
        int missingValue = missingNumber.find(new int[]{1,3,4});
        assertEquals(2, missingValue);
    }
    @Test
    public void given1345_returns2() {
        int missingValue = missingNumber.find(new int[]{1,3,4,5});
        assertEquals(2, missingValue);
    }

}
