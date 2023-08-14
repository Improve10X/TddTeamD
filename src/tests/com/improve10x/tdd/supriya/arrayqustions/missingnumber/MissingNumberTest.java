package com.improve10x.tdd.supriya.arrayqustions.missingnumber;

import com.improve10x.tdd.supriya.arrayquestions.missingnumber.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
//    Find the missing number in an array
//    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
//    Find the number(between 1 to N), that is not present in the given array.
  private MissingNumber missingNumber;
  private final int invalid = -1;
@BeforeEach
public void setUp(){
    missingNumber = new MissingNumber();

}
    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnInvalid(){
        int missingValue = missingNumber.find(null);
        Assertions.assertEquals(invalid, missingValue);
    }

    @Test
    public void givenEmpty_returnInvalid(){
        MissingNumber missingNumber = new MissingNumber();
        int missingValue = missingNumber.find(new int[]{});
        Assertions.assertEquals(invalid, missingValue);
    }




}