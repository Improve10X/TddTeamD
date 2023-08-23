package com.improve10x.tdd.supriya.arrayqustions.linersearch;

import com.improve10x.tdd.supriya.arrayquestions.linearsearch.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(null,1);
        Assertions.assertEquals(-1, search);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(new int[]{},1);
        Assertions.assertEquals(-1, search);
    }

    @Test
    public void given0_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(new int[]{0},1);
        Assertions.assertEquals(-1, search);
    }

    @Test
    public void given01and1_return1(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(new int[]{0,1},1);
        Assertions.assertEquals(1, search);
    }

    @Test
    public void given10_return1(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(new int[]{0,1},2);
        Assertions.assertEquals(-1, search);
    }



}
