package com.improve10x.tdd.krishna.test2problems.singleonetest;

import com.improve10x.tdd.krishna.test2problems.singleone.SingleOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleOneTest {


    final int invalid = -1;
    private SingleOne singleOne;

    @BeforeEach
    public void setup(){
        singleOne = new SingleOne();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        int result = singleOne.findSingle(null);
        assertEquals(invalid, result);
    }

    @Test
    public void givenEmpty_returnsMinusOne(){
        int result = singleOne.findSingle(new int[]{});
        assertEquals(invalid, result);
    }

    @Test
    public void given0_returns0(){
        int result = singleOne.findSingle(new int[]{0});
        assertEquals(0, result);
    }

    @Test
    public void given1_returns1(){
        int result = singleOne.findSingle(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void given00_returnsMinusOne(){
        int result = singleOne.findSingle(new int[]{0, 0});
        assertEquals(invalid, result);
    }
}
