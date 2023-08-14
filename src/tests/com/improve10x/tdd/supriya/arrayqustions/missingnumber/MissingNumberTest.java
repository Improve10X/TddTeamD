package com.improve10x.tdd.supriya.arrayqustions.missingnumber;

import com.improve10x.tdd.supriya.arrayquestions.missingnumber.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
//    Find the missing number in an array
//    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
//    Find the number(between 1 to N), that is not present in the given array.

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnInvalid(){
        MissingNumber missingNumber = new MissingNumber();
        int missingValue = missingNumber.find(null);
        Assertions.assertEquals(-1, missingValue);
    }




}