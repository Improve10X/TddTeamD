package com.improve10x.tdd.krishna.test2problems.checkarraysortedtest;

import com.improve10x.tdd.krishna.test2problems.checkarraysorted.ArraySorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraySortedTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsTrue(){
        ArraySorted arraySorted = new ArraySorted();
        boolean result = arraySorted.isSortedArray(null);
        assertTrue(result);
    }

    @Test
    public void givenEmpty_returnsTrue(){
        ArraySorted arraySorted = new ArraySorted();
        boolean result = arraySorted.isSortedArray(new int[] {});
        assertTrue(result);
    }
}
