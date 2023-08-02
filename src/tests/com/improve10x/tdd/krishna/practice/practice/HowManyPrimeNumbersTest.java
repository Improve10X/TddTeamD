package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyPrimeNumbersTest {

    HowManyPrimeNumbers howManyPrimeNumbers;

    @BeforeEach
    public void setup(){
        howManyPrimeNumbers = new HowManyPrimeNumbers();
    }

    @Test
    public void nothing(){
    }

//    @Test
//    public void givenZero_returnsZero(){
//        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(0);
//        assertEquals(0, noOfPrimeNumbers);
//    }
//
//    @Test
//    public void givenOne_returnsZero(){
//        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(1);
//        assertEquals(0, noOfPrimeNumbers);
//    }
//
//    @Test
//    public void givenTwo_returnsOne(){
//        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(2);
//        assertEquals(1, noOfPrimeNumbers);
//    }
//
//    @Test
//    public void givenThree_returnsTwo(){
//        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(3);
//        assertEquals(2, noOfPrimeNumbers);
//    }
//
//    @Test
//    public void givenFour_returnsTwo(){
//        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(4);
//        assertEquals(2, noOfPrimeNumbers);
//    }

    @Test
    public void given0_returnFalse(){
        boolean status = howManyPrimeNumbers.isPrime(0);
        assertEquals(false, status);
    }

    @Test
    public void given1_returnFalse(){
        boolean status = howManyPrimeNumbers.isPrime(1);
        assertEquals(false, status);
    }
}
