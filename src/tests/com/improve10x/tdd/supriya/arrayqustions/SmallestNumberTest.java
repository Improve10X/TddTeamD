package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.smallestNumber.SmallestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestNumberTest {
    SmallestNumber smallestNumber;

    @BeforeEach
    public void setUp() {
        smallestNumber = new SmallestNumber();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_return0() {
        int number = smallestNumber.findSmallestNumber(null);
        assertEquals(0, number);
    }

    @Test
    public void givenEmpty_return0() {
        int number = smallestNumber.findSmallestNumber(new int[]{});
        assertEquals(0, number);
    }

    @Test
    public void given0_return0() {
        int number = smallestNumber.findSmallestNumber(new int[]{0});
        assertEquals(0, number);
    }

    @Test
    public void given10_return0() {
        int number = smallestNumber.findSmallestNumber(new int[]{1, 0});
        assertEquals(0, number);
    }

    @Test
    public void given21_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 1});
        assertEquals(1, number);
    }

    @Test
    public void given35_return3() {
        int number = smallestNumber.findSmallestNumber(new int[]{3, 5});
        assertEquals(3, number);
    }

    @Test
    public void given231_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 3, 1});
        assertEquals(1, number);
    }

    @Test
    public void given123_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{1, 2, 3});
        assertEquals(1, number);
    }

    @Test
    public void given210_return0() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 1, 0});
        assertEquals(0, number);
    }

    @Test
    public void given1234_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{1, 2, 3, 4});
        assertEquals(1, number);
    }

    @Test
    public void given2134_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 1, 3, 4});
        assertEquals(1, number);
    }

    @Test
    public void given2314_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 3, 1, 4});
        assertEquals(1, number);
    }

    @Test
    public void given2341_return1() {
        int number = smallestNumber.findSmallestNumber(new int[]{2, 3, 4, 1});
        assertEquals(1, number);
    }

    @Test
    public void given4635_return3() {
        int number = smallestNumber.findSmallestNumber(new int[]{4,6,3,5});
        assertEquals(3, number);
    }
}
