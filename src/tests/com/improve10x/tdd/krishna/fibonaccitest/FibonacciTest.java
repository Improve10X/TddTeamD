package com.improve10x.tdd.krishna.fibonaccitest;

import com.improve10x.tdd.krishna.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenAnyNegativeInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-4);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1 , negativeFibonacci);
    }

    @Test
    public void givenOne_returnsZero(){
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0 , firstFibonacci);
    }

    @Test
    public void givenTwo_returnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1 , secondFibonacci);
    }

    @Test
    public void givenThree_returnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1 , thirdFibonacci);
    }

    @Test
    public void givenSix_returnsFive(){
        Fibonacci fibonacci = new Fibonacci();
        int sixFibonacci = fibonacci.findNthNumber(6);
        assertEquals(5 ,sixFibonacci);
    }
}
