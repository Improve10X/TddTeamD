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
}
