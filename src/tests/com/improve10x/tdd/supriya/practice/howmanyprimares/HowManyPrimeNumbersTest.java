package com.improve10x.tdd.supriya.practice.howmanyprimares;

import com.improve10x.tdd.supriya.practice.howmanyprimenumbers.HowManyPrimeNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
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
    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(0);
        Assertions.assertEquals(0, primeNumbers);
    }

    @Test
    public void givenOne_returnZero(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(0);
        Assertions.assertEquals(0, primeNumbers);
    }

    @Test
    public void givenTwo_returnOne(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(2);
        Assertions.assertEquals(1, primeNumbers);
    }

    @Test
    public void givenThree_returnTwo(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(3);
        Assertions.assertEquals(2, primeNumbers);
    }
    @Test
    public void givenFour_returnTwo(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(4);
        Assertions.assertEquals(2, primeNumbers);
    }
    @Test
    public void givenFive_returnThree(){
        HowManyPrimeNumbers howManyPrimeNumbers = new HowManyPrimeNumbers();
        int primeNumbers = howManyPrimeNumbers.findPrimeNumber(5);
        Assertions.assertEquals(3, primeNumbers);
    }
}
