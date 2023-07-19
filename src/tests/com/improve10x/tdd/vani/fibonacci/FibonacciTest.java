package com.improve10x.tdd.vani.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing() {
    }

    //any negative number -> -1
    @Test
    public void givenAnyNegativeInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthFibonacci(-6);
        assertEquals(-1, negativeFibonacci);
    }

    //    0 - > -1
    @Test
    public void givenZero_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthFibonacci(0);
        assertEquals(-1,negativeFibonacci);
    }

    //    1 --> 0
    @Test
    public void givenOne_returnsZero(){
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthFibonacci(1);
        assertEquals(0,firstFibonacci);
    }

    //    2 -> 1
    @Test
    public void givenTwo_returnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthFibonacci(2);
        assertEquals(1,secondFibonacci);
    }

    //    3 -> 1
    @Test
    public void givenThree_returnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.findNthFibonacci(3);
        assertEquals(1,thirdFibonacci);
    }

    //    4 -> 2
//    5 -> 3
    @Test
    public void givenFive_returnsThree(){
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.findNthFibonacci(5);
        assertEquals(3,fifthFibonacci);
    }
    // ....................................1000 -> 998
    @Test
    public void givenThousand_returnsNineNineEight(){
        Fibonacci fibonacci = new Fibonacci();
        int thousandFibonacci = fibonacci.findNthFibonacci(1000);
        assertEquals(998,thousandFibonacci);
    }
}
