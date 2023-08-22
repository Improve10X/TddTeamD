package com.improve10x.tdd.krishna.test2problems.moveallzerostoendtest;

import com.improve10x.tdd.krishna.test2problems.moveallzerostoend.AllZerosToTheEnd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AllZerosToTheEndTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        AllZerosToTheEnd allZerosToTheEnd = new AllZerosToTheEnd();
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(null);
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    public void givenEmpty_returnsMinusOne(){
        AllZerosToTheEnd allZerosToTheEnd = new AllZerosToTheEnd();
        int[] result = allZerosToTheEnd.moveAllZerosToTheEnd(new int[]{});
        assertArrayEquals(new int[]{-1}, result);
    }
}
