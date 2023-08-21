package com.improve10x.tdd.supriya.arrayqustions.arraysorted;

import com.improve10x.tdd.supriya.arrayquestions.arraysorted.ArraySorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraySortedTest {
    ArraySorted arraySorted;
    @BeforeEach
    public void setUp(){
        arraySorted = new ArraySorted();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnTrue(){
        boolean sorted = arraySorted.find(null);
        Assertions.assertEquals(true, sorted);
    }
    @Test
    public void givenEmpty_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{});
        Assertions.assertEquals(true, sorted);
    }
    @Test
    public void given0_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{0});
        Assertions.assertEquals(true, sorted);
    }
    @Test
    public void given1_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{1});
        Assertions.assertEquals(true, sorted);
    }

    @Test
    public void given10_returnFalse(){
        boolean sorted = arraySorted.find(new int[]{1,0});
        Assertions.assertEquals(false, sorted);
    }

    @Test
    public void given01_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{0,1});
        Assertions.assertEquals(true, sorted);
    }

}
