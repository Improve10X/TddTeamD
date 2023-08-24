package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.AppearsOnce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class AppearsOnceTest {
    AppearsOnce appearsOnce;

    @BeforeEach
    public void setUp() {
        appearsOnce = new AppearsOnce();

    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinusOne() {
        int singleElement = appearsOnce.find(null);
        assertEquals(-1, singleElement);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        int singleElement = appearsOnce.find(new int[]{});
        assertEquals(-1, singleElement);
    }

    @Test
    public void given0_return0() {
        int singleElement = appearsOnce.find(new int[]{0});
        assertEquals(0, singleElement);
    }

    @Test
    public void given1_return1() {
        int singleElement = appearsOnce.find(new int[]{1});
        assertEquals(1, singleElement);
    }

    @Test
    public void given001_return1() {
        int singleElement = appearsOnce.find(new int[]{0, 0, 1});
        assertEquals(1, singleElement);
    }

    @Test
    public void given110_return0() {
        int singleElement = appearsOnce.find(new int[]{1, 1, 0});
        assertEquals(0, singleElement);
    }

    @Test
    public void given11002_return2() {
        int singleElement = appearsOnce.find(new int[]{1, 1, 0, 0, 2});
        assertEquals(2, singleElement);
    }

    @Test
    public void given10012_return2() {
        int singleElement = appearsOnce.find(new int[]{1, 0, 0, 1, 2});
        assertEquals(2, singleElement);
    }
}
