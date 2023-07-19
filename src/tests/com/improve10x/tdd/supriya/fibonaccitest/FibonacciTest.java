package com.improve10x.tdd.supriya.fibonaccitest;

import com.improve10x.tdd.supriya.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenAnyNegativeInteger_returnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-3);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-3);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void giveOne_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0,firstFibonacci);
    }

    @Test
    public void giveTwo_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1,secondFibonacci);
    }

    @Test
    public void giveThree_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int ThirdFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1,ThirdFibonacci);
    }

    @Test
    public void giveFive_returnThree(){
        Fibonacci fibonacci = new Fibonacci();
        int fourthFibonacci = fibonacci.findNthNumber(5);
        assertEquals(3,fourthFibonacci);
    }

}
