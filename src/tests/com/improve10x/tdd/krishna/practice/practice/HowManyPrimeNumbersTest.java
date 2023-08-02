package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyPrimeNumbersTest {

    HowManyPrimeNumbers howManyPrimeNumbers;

    @BeforeEach
    public void setup() {
        howManyPrimeNumbers = new HowManyPrimeNumbers();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnsZero() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(0);
        assertEquals(0, noOfPrimeNumbers);
    }

    @Test
    public void givenOne_returnsZero() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(1);
        assertEquals(0, noOfPrimeNumbers);
    }

    @Test
    public void givenMinusOne_returnsMinusOne() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(-1);
        assertEquals(-1, noOfPrimeNumbers);
    }

    @Test
    public void givenTwo_returnsOne() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(2);
        assertEquals(1, noOfPrimeNumbers);
    }

    @Test
    public void givenThree_returnsTwo() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(3);
        assertEquals(2, noOfPrimeNumbers);
    }

    @Test
    public void givenFour_returnsTwo() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(4);
        assertEquals(2, noOfPrimeNumbers);
    }

    @Test
    public void given0_returnFalse() {
        boolean status = howManyPrimeNumbers.isPrime(0);
        assertEquals(false, status);
    }

    @Test
    public void given1_returnFalse() {
        boolean status = howManyPrimeNumbers.isPrime(1);
        assertEquals(false, status);
    }

    @Test
    public void givenMinusOne_returnFalse() {
        boolean status = howManyPrimeNumbers.isPrime(-1);
        assertEquals(false, status);
    }

    @Test
    public void given2_returnTrue() {
        boolean status = howManyPrimeNumbers.isPrime(2);
        assertEquals(true, status);
    }

    @Test
    public void given3_returnTrue() {
        boolean status = howManyPrimeNumbers.isPrime(3);
        assertEquals(true, status);
    }

    @Test
    public void given4_returnFalse() {
        boolean status = howManyPrimeNumbers.isPrime(4);
        assertEquals(false, status);
    }

    @Test
    public void given5_returnTrue() {
        boolean status = howManyPrimeNumbers.isPrime(5);
        assertEquals(true, status);
    }

    @Disabled
    @Test
    public void integration() {
        int noOfPrimeNumbers = howManyPrimeNumbers.findPrimeNumbers(10);
        assertEquals(4, noOfPrimeNumbers);
        int noOfPrimeNumbers1 = howManyPrimeNumbers.findPrimeNumbers(20);
        assertEquals(8, noOfPrimeNumbers1);
        int noOfPrimeNumbers2 = howManyPrimeNumbers.findPrimeNumbers(30);
        assertEquals(10, noOfPrimeNumbers2);
    }
}