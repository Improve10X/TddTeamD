package com.improve10x.tdd.supriya.arrayqustions.linersearch;

import com.improve10x.tdd.supriya.arrayquestions.linearsearch.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    LinearSearch linearSearch;
    @BeforeEach
    public void setUp(){
        linearSearch = new LinearSearch();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        int search = linearSearch.find(null,1);
        assertEquals(-1, search);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int search = linearSearch.find(new int[]{},1);
        assertEquals(-1, search);
    }

    @Test
    public void given0_returnMinusOne(){
        int search = linearSearch.find(new int[]{0},1);
        assertEquals(-1, search);
    }

    @Test
    public void given01and1_return1(){
        int search = linearSearch.find(new int[]{0,1},1);
        assertEquals(1, search);
    }

    @Test
    public void given10_returnMinusOne(){
        int search = linearSearch.find(new int[]{0,1},2);
        assertEquals(-1, search);
    }

    @Test
    public void given102_return0(){
        int search = linearSearch.find(new int[]{1,0,2},1);
        assertEquals(0, search);
    }

    @Test
    public void given102_return2(){
        int search = linearSearch.find(new int[]{1,0,2},2);
        assertEquals(2, search);
    }
    @Test
    public void given102_return(){
        int search = linearSearch.find(new int[]{1,0,2},3);
        assertEquals(-1, search);
    }

    @Test
    public void given1023_return0(){
        int search = linearSearch.find(new int[]{1,0,2},1);
        assertEquals(0, search);
    }

    @Test
    public void given12345_return2(){
        int search = linearSearch.find(new int[]{1,2,3,4,5},3);
        assertEquals(2, search);
    }





}
