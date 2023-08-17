package com.improve10x.tdd.krishna.test2problems.checkarraysortedtest;

import com.improve10x.tdd.krishna.test2problems.checkarraysorted.ArraySorted;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraySortedTest {

    private   ArraySorted arraySorted;

    @BeforeEach
    public void setup(){
        arraySorted = new ArraySorted();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsTrue(){
        boolean result = arraySorted.isSortedArray(null);
        assertTrue(result);
    }

    @Test
    public void givenEmpty_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[] {});
        assertTrue(result);
    }

    @Test
    public void given0_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{0});
        assertTrue(result);
    }

    @Test
    public void given1_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{1});
        assertTrue(result);
    }

    @Test
    public void given01_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{0, 1});
        assertTrue(result);
    }

    @Test
    public void given10_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{1, 0});
        assertFalse(result);
    }

    @Test
    public void given11_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{1, 1});
        assertTrue(result);
    }

    @Test
    public void given12_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{1, 2});
        assertTrue(result);
    }

    @Test
    public void given21_returnsFalse(){
        boolean result = arraySorted.isSortedArray(new int[]{2, 1});
        assertFalse(result);
    }

    @Test
    public void given123_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{1, 2, 3});
        assertTrue(result);
    }

    @Test
    public void given213_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{2, 1, 3});
        assertFalse(result);
    }

    @Test
    public void given0123_returnsTrue(){
        boolean result = arraySorted.isSortedArray(new int[]{0, 1, 2, 3});
        assertTrue(result);
    }
}
