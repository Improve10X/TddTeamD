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
    public void givenMinus1_returnsMinus1(){
        int number = primeNumbers.calcPrimeNumbers(-1);
        assertEquals(-1,number);
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
    @Test
    public void givenFive_returns3(){
        int number = primeNumbers.calcPrimeNumbers(5);
        assertEquals(3,number);
    }
//    @Test
//    public void integrationTest() {
//        int four = primeNumbers.calcPrimeNumbers(10);
//        assertEquals(4, four);
//        int eight = primeNumbers.calcPrimeNumbers(20);
//        assertEquals(8,eight);
//        int ten = primeNumbers.calcPrimeNumbers(30);
//        assertEquals(10,ten);
//    }
    @Test
    public void given0_returnsFalse(){
        boolean state = primeNumbers.isPrime(0);
        assertEquals(false, state);
    }
    @Test
    public void givenOne_returnsFalse(){
        boolean state = primeNumbers.isPrime(1);
        assertEquals(false, state);
    }
    @Test
    public void givenMinus1_returnsFalse(){
        boolean state = primeNumbers.isPrime(-1);
        assertEquals(false, state);
    }
    @Test
    public void givenTwo_returnsTrue(){
        boolean state = primeNumbers.isPrime(2);
        assertEquals(true, state);
    }
    @Test
    public void givenThree_returnsTrue(){
        boolean state = primeNumbers.isPrime(3);
        assertEquals(true, state);
    }
    @Test
    public void givenFour_returnsFalse(){
        boolean state = primeNumbers.isPrime(4);
        assertEquals(false, state);
    }
    @Test
    public void givenFive_returnsTrue(){
        boolean state = primeNumbers.isPrime(5);
        assertEquals(true, state);
    }
    @Test
    public void integrationTest1(){
        boolean state = primeNumbers.isPrime(10);
        assertEquals(false, state);
        boolean state1 = primeNumbers.isPrime(20);
        assertEquals(false, state1);
        boolean state2 = primeNumbers.isPrime(30);
        assertEquals(false, state2);
    }
}
