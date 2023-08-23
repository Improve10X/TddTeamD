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
        int search = linearSearch.find(null);
        Assertions.assertEquals(-1, search);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int search = linearSearch.find(new int[]{});
        Assertions.assertEquals(-1, search);
    }


}
