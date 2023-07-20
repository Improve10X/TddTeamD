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
//-1,-1,
// -2,-1,
//  -3,-1,
//  -4,-1
    @Test
    public void givenNegativeNumber4_returnsNegativeMinusOne(){
        Fibonacci fibonacci = new Fibonacci();
        int minus4 = fibonacci.find(-4);
        Assertions.assertEquals(-1,minus4);
    }
}
