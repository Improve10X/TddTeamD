package com.improve10x.tdd.team;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {}

    @Test
    public void givenMinus1_returnsMinusOne() {
        Fibonacci fibonacci = new Fibonacci();
        int minusOne = fibonacci.find(-1);
        assertEquals(-1, minusOne);
    }

    @Test
    public void givenZero_returnsMinusOne(){
        Fibonacci fibonacci = new Fibonacci();
        int  minusOne = fibonacci.find(0);
        Assertions.assertEquals(-1,minusOne);
    }

    @Test
    public void givenOne_returnsZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zero = fibonacci.find(1);
        assertEquals(0, zero);
    }

    @Test
    public void givenMinusTwo_returnsMinusOne(){
        Fibonacci fibonacci = new Fibonacci();
        int minusOne = fibonacci.find(-2);
        assertEquals(-1, minusOne);
    }

    @Test
    public void givenMinusFive_returnsMinusOne() {
        Fibonacci fibonacci = new Fibonacci();
        int minusOne = fibonacci.find(-5);
        assertEquals(-1, minusOne);
    }
    @Test
    public void givenMinusThree_returnsMinusOne(){
        Fibonacci fibonacci = new Fibonacci();
        int minusThree = fibonacci.find(-3);
        assertEquals(-1, minusThree);
    }
}
