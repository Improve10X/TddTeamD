package com.improve10x.tdd.supriya.arrayqustions.missingnumber;

import com.improve10x.tdd.supriya.arrayquestions.missingnumber.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    //    Find the missing number in an array
//    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
//    Find the number(between 1 to N), that is not present in the given array.
    private MissingNumber missingNumber;
    private final int invalid = -1;

    @BeforeEach
    public void setUp() {
        missingNumber = new MissingNumber();

    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnInvalid() {
        int missingValue = missingNumber.find(null);
        assertEquals(invalid, missingValue);
    }

    @Test
    public void givenEmpty_returnInvalid() {
        int missingValue = missingNumber.find(new int[]{});
        assertEquals(invalid, missingValue);
    }

    @Test
    public void given0_returnInvalid() {
        int missingValue = missingNumber.find(new int[]{0});
        assertEquals(invalid, missingValue);
    }

    @Test
    public void given1_return0() {
        int missingValue = missingNumber.find(new int[]{1});
        assertEquals(2, missingValue);
    }

    @Test
    public void given2_return1() {
        int missingValue = missingNumber.find(new int[]{2});
        assertEquals(1, missingValue);
    }

    @Test
    public void given13_return2() {
        int missingValue = missingNumber.find(new int[]{1, 3});
        assertEquals(2, missingValue);
    }

    @Test
    public void given12_return3() {
        int missingValue = missingNumber.find(new int[]{1, 2});
        assertEquals(3, missingValue);
    }

    @Test
    public void given23_return1() {
        int missingValue = missingNumber.find(new int[]{2, 3});
        assertEquals(1, missingValue);
    }

    @Test
    public void given234_return1() {
        int missingValue = missingNumber.find(new int[]{2, 3, 4});
        assertEquals(1, missingValue);
    }

    @Test
    public void given124_return3() {
        int missingValue = missingNumber.find(new int[]{1, 2, 4});
        assertEquals(3, missingValue);
    }

    @Test
    public void given134_return2() {
        int missingValue = missingNumber.find(new int[]{1, 3, 4});
        assertEquals(2, missingValue);
    }

    @Test
    public void given123_return4() {
        int missingValue = missingNumber.find(new int[]{1, 2, 3});
        assertEquals(4, missingValue);
    }

    @Test
    public void given1345_return2() {
        int missingValue = missingNumber.find(new int[]{1, 3, 4, 5});
        assertEquals(2, missingValue);
    }

    @Test
    public void given2345_return1() {
        int missingValue = missingNumber.find(new int[]{2, 3, 4, 5});
        assertEquals(1, missingValue);
    }

    @Test
    public void given1245_return3() {
        int missingValue = missingNumber.find(new int[]{1,2, 4, 5});
        assertEquals(3, missingValue);
    }

    @Test
    public void given1234_return5() {
        int missingValue = missingNumber.find(new int[]{1,2,3,4});
        assertEquals(5, missingValue);
    }

    @Test
    public void given123457_return6() {
        int missingValue = missingNumber.find(new int[]{1,2,3,4,5,7});
        assertEquals(6, missingValue);
    }

    @Test
    public void given12345679_return8() {
        int missingValue = missingNumber.find(new int[]{1,2,3,4,5,6,7,9});
        assertEquals(8, missingValue);
    }

    @Test
    public void given13246579_return8() {
        int missingValue = missingNumber.find(new int[]{1,3,2,4,6,5,7,9});
        assertEquals(8, missingValue);
    }

    @Test
    public void given154327_return6() {
        int missingValue = missingNumber.find(new int[]{1,5,4,3,2,7});
        assertEquals(6, missingValue);
    }

    @Test
    public void given98765432_return1() {
        int missingValue = missingNumber.find(new int[]{9,8,7,6,5,4,3,2});
        assertEquals(1, missingValue);
    }

    @Test
    public void given97613452_return8() {
        int missingValue = missingNumber.find(new int[]{9,7,6,1,3,4,5,2});
        assertEquals(8, missingValue);
    }
}