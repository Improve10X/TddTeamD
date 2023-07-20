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
}
