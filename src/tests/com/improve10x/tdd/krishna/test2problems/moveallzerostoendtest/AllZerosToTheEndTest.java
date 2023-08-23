package com.improve10x.tdd.krishna.test2problems.moveallzerostoendtest;

import com.improve10x.tdd.krishna.test2problems.moveallzerostoend.AllZerosToTheEnd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AllZerosToTheEndTest {

    private AllZerosToTheEnd allZerosToTheEnd;

    @BeforeEach
    public void setup() {
        allZerosToTheEnd = new AllZerosToTheEnd();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsMinusOne() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(null);
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    public void givenEmpty_returnsMinusOne() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{});
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    public void given0_returns0() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void given1_returns1() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void given01_returns10() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 1});
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void given10_returns10() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 0});
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void given12_returns12() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given00_returns00() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 0});
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    public void given012_returns120() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 1, 2});
        assertArrayEquals(new int[]{1, 2, 0}, result);
    }

    @Test
    public void given201_returns210() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{2, 0, 1});
        assertArrayEquals(new int[]{2, 1, 0}, result);
    }

    @Test
    public void given120_returns120() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 2, 0});
        assertArrayEquals(new int[]{1, 2, 0}, result);
    }

    @Test
    public void given001_returns100() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 0, 1});
        assertArrayEquals(new int[]{1, 0, 0}, result);
    }

    @Test
    public void given010_returns100() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 1, 0});
        assertArrayEquals(new int[]{1, 0, 0}, result);
    }

    @Test
    public void given000_returns000() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{0, 0, 0});
        assertArrayEquals(new int[]{0, 0, 0}, result);
    }

    @Test
    public void given132_returns132() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 3, 2});
        assertArrayEquals(new int[]{1, 3, 2}, result);
    }

    @Test
    public void given1320_returns1320() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 3, 2, 0});
        assertArrayEquals(new int[]{1, 3, 2, 0}, result);
    }

    @Test
    public void given1302_returns1320() {
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{1, 3, 0, 2});
        assertArrayEquals(new int[]{1, 3, 2, 0}, result);
    }

}
