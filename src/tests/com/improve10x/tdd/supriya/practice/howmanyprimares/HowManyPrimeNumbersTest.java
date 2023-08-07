package com.improve10x.tdd.supriya.practice.howmanyprimares;

import com.improve10x.tdd.supriya.practice.howmanyprimenumbers.HowManyPrimeNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

public class HowManyPrimeNumbersTest {
    HowManyPrimeNumbers howManyPrimeNumbers;
    @BeforeEach
    public void setUp(){
        howManyPrimeNumbers = new HowManyPrimeNumbers();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnZero(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(0);
        Assertions.assertEquals(0, primeNumbers);
    }

    @Test
    public void givenOne_returnZero(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(0);
        Assertions.assertEquals(0, primeNumbers);
    }

    @Test
    public void givenMinusOne_returnMinusOne(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(-1);
        Assertions.assertEquals(-1, primeNumbers);
    }

    @Test
    public void givenTwo_returnOne(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(2);
        Assertions.assertEquals(1, primeNumbers);
    }

    @Test
    public void integrationsTest(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(20);
        Assertions.assertEquals(8, primeNumbers);
        int primeNumbers1 = howManyPrimeNumbers.findPrimeNumber(10);
        Assertions.assertEquals(4, primeNumbers1);
        int primeNumbers2 = howManyPrimeNumbers.findPrimeNumber(30);
        Assertions.assertEquals(10, primeNumbers2);
    }


    @Test
    public void givenThree_returnTwo(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(3);
        Assertions.assertEquals(2, primeNumbers);
    }
    @Test
    public void givenFour_returnTwo(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(4);
        Assertions.assertEquals(2, primeNumbers);
    }

    @Test
    public void givenFive_returnThree(){
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(5);
        Assertions.assertEquals(3, primeNumbers);
    }

    @Test
    public void given0_returnFalse() {
        boolean status = howManyPrimeNumbers.isPrime(0);
        assertEquals(false, status);
    }

    @Test
    public void given1_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(1);
        assertEquals(false, status);
    }

    @Test
    public void givenMinusOne_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(-1);
        assertEquals(false, status);
    }

    @Test
    public void given2_returnTrue() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(2);
        assertEquals(true, status);
    }

    @Test
    public void given3_returnTrue() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(3);
        assertEquals(true, status);
    }

    @Test
    public void given4_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(4);
        assertEquals(false, status);
    }

    @Test
    public void given5_returnTrue() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(5);
        assertEquals(true, status);
    }

    @Test
    public void given6_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(6);
        assertEquals(false, status);
    }

    @Test
    public void given7_returnTrue() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(7);
        assertEquals(true, status);
    }

    @Test
    public void given20_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(20);
        assertEquals(false, status);
    }

    @Test
    public void given10_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(10);
        assertEquals(false, status);
    }

    @Test
    public void given30_returnFalse() {
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        boolean status = howManyPrimeNumbers.isPrime(30);
        assertEquals(false, status);
    }


}
