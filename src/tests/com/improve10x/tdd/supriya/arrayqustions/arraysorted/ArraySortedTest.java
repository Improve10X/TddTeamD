package com.improve10x.tdd.supriya.arrayqustions.arraysorted;

import com.improve10x.tdd.supriya.arrayquestions.arraysorted.ArraySorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySortedTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnTrue(){
        ArraySorted arraySorted = new ArraySorted();
        boolean sorted = arraySorted.find(null);
        Assertions.assertEquals(true, sorted);
    }
    @Test
    public void givenEmpty_returnTrue(){
        ArraySorted arraySorted = new ArraySorted();
        boolean sorted = arraySorted.find(new int[]{});
        Assertions.assertEquals(true, sorted);
    }
}
