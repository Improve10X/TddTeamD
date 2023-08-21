package com.improve10x.tdd.krishna.test2problems.indexoftheelementtest;

import com.improve10x.tdd.krishna.test2problems.indexoftheelement.IndexOfTheElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfTheElementTest {

    private final int invalid = -1;

    private IndexOfTheElement indexOfTheElement;

    @BeforeEach
    public void setup(){
        indexOfTheElement = new IndexOfTheElement();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        int index = indexOfTheElement.findIndex(null, 0);
        assertEquals(invalid, index);
    }

    @Test
    public void givenEmpty_returnsMinusOne(){
        int index = indexOfTheElement.findIndex(new int[]{}, 1);
        assertEquals(invalid, index);
    }

    @Test
    public void given0_returns0(){
        int index = indexOfTheElement.findIndex(new int[]{0}, 0);
        assertEquals(0, index);
    }

    @Test
    public void given1_returns0(){
        int index = indexOfTheElement.findIndex(new int[]{1}, 0);
        assertEquals(0, index);
    }
}
