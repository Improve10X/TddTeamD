package com.improve10x.tdd.supriya.arrayqustions.arraysorted;

import com.improve10x.tdd.supriya.arrayquestions.arraysorted.ArraySorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//Check if an Array is Sorted
//        Problem Statement: Given an array of size n, write a program to check if the given
//        array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array
//        is sorted then return True, Else return False.
//        Note: Two consecutive equal values are considered to be sorted.
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
    @Test
    public void given012_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{0,1,2});
        Assertions.assertEquals(true, sorted);
    }

    @Test
    public void given021_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{0,2,1});
        Assertions.assertEquals(false, sorted);
    }

    @Test
    public void given123_returnTrue(){
        boolean sorted = arraySorted.find(new int[]{1,2,3});
        Assertions.assertEquals(true, sorted);
    }

    @Test
    public void given132_returnFalse(){
        boolean sorted = arraySorted.find(new int[]{1,3,2});
        Assertions.assertEquals(false, sorted);
    }

    @Test
    public void given321_returnFalse(){
        boolean sorted = arraySorted.find(new int[]{3,2,1});
        Assertions.assertEquals(false, sorted);
    }

    @Test
    public void given1324_returnFalse(){
        boolean sorted = arraySorted.find(new int[]{1,3,2,4});
        Assertions.assertEquals(false, sorted);
    }

    @Test
    public void given1432_returnFalse(){
        boolean sorted = arraySorted.find(new int[]{1,4,3,2});
        Assertions.assertEquals(false, sorted);
    }
}
