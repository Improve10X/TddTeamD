package com.improve10x.tdd.vani.primenumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//How Many "Prime Numbers" Are There?
//        Create a function that finds how many prime numbers there are, up to the given integer.
//        Examples
//        primeNumbers(10) ➞ 4
// 2, 3, 5 and 7
//        primeNumbers(20) ➞ 8
// 2, 3, 5, 7, 11, 13, 17 and 19
//        primeNumbers(30) ➞ 10
// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29

public class PrimeNumbersTest {
    PrimeNumbers primeNumbers;
    @BeforeEach
    public void setUp(){
        primeNumbers = new PrimeNumbers();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenZero_returnsZero(){
        int number = primeNumbers.calcPrimeNumbers(0);
        assertEquals(0,number);
    }
    @Test
    public void givenOne_returns0(){
        int number = primeNumbers.calcPrimeNumbers(1);
        assertEquals(0,number);
    }
    @Test
    public void givenTwo_returns1(){
        int number = primeNumbers.calcPrimeNumbers(2);
        assertEquals(1,number);
    }
    @Test
    public void givenThree_returns2(){
        int number = primeNumbers.calcPrimeNumbers(3);
        assertEquals(2,number);
    }
    @Test
    public void givenFour_returns2(){
        int number = primeNumbers.calcPrimeNumbers(4);
        assertEquals(2,number);
    }
}
