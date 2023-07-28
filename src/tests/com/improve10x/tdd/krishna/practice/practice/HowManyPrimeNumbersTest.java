package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyPrimeNumbersTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnsZero(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int[] noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(0);
        assertArrayEquals(new int[0], noOfPrimeNumbers);
    }
}
