package com.improve10x.tdd.vani.leadersarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersArrayTest {
    private LeadersArray leadersArray;

    @BeforeEach
    public void setUp(){
        leadersArray = new LeadersArray();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsEmpty(){
        int[] values = leadersArray.find(null);
        assertArrayEquals(new int[]{}, values);
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        int[] values = leadersArray.find(new int[]{});
        assertArrayEquals(new int[]{}, values);
    }
    @Test
    public void given0_returns0(){
        int[] values = leadersArray.find(new int[]{0});
        assertArrayEquals(new int[]{0}, values);
    }
    @Test
    public void given1_returns1(){
        int[] values = leadersArray.find(new int[]{1});
        assertArrayEquals(new int[]{1}, values);
    }
    @Test
    public void given01_returns1(){
        int[] values = leadersArray.find(new int[]{0,1});
        assertArrayEquals(new int[]{1}, values);
    }
    @Test
    public void given10_returns10(){
        int[] values = leadersArray.find(new int[]{1,0});
        assertArrayEquals(new int[]{1,0}, values);
    }
    @Test
    public void given11_returns11(){
        int[] values = leadersArray.find(new int[]{1,1});
        assertArrayEquals(new int[]{1,1}, values);
    }
    @Test
    public void given110_returns110(){
        int[] values = leadersArray.find(new int[]{1,1,0});
        assertArrayEquals(new int[]{1,1,0}, values);
    }
    @Test
    public void given123_returns3(){
        int[] values = leadersArray.find(new int[]{1,2,3});
        assertArrayEquals(new int[]{3}, values);
    }
}
