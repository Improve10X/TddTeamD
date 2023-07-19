package com.improve10x.tdd.vani.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing() {}

    @Test
    public void givenZero_returns_Zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(0);
        assertEquals("0", zero);
    }

    @Test
    public void givenMinus1_returnsMinus1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String minusOne = fizzBuzz.find(-1);
        assertEquals("-1", minusOne);
    }

    @Test
    public void given3_returnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizz = fizzBuzz.find(3);
        assertEquals("Fizz", fizz);
    }

    @Test
    public void given6_returnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizz = fizzBuzz.find(6);
        assertEquals("Fizz", fizz);
    }

    @Test
    public void given5_returnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String buzz = fizzBuzz.find(5);
        assertEquals("Buzz", buzz);
    }

    @Test
    public void given25_returnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String buzz = fizzBuzz.find(25);
        assertEquals("Buzz", buzz);
    }

    @Test
    public void given15_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzBuzzText = fizzBuzz.find(15);
        assertEquals("FizzBuzz", fizzBuzzText);
    }

    @Test
    public void given90_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzBuzzText = fizzBuzz.find(90);
        assertEquals("FizzBuzz", fizzBuzzText);
    }
}
