package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.leadersinarray.LeadersInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInArrayTest {
    LeadersInArray leadersInArray;

    @BeforeEach
    public void setUp (){
        leadersInArray = new LeadersInArray();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_return0(){
        int[] leader = leadersInArray.find(null);
        assertArrayEquals(new int[]{0},leader);
    }

    @Test
    public void givenEmpty_return0(){
        int[] leader = leadersInArray.find(new int[]{});
        assertArrayEquals(new int[]{0},leader);
    }

    @Test
    public void given1_return1(){
        int[] leader = leadersInArray.find(new int[]{1});
        assertArrayEquals(new int[]{1},leader);
    }

    @Test
    public void given0_return0(){
        int[] leader = leadersInArray.find(new int[]{0});
        assertArrayEquals(new int[]{0},leader);
    }

    @Test
    public void given01_return1(){
        int[] leader = leadersInArray.find(new int[]{0,1});
        assertArrayEquals(new int[]{1},leader);
    }

    @Test
    public void given11_return11(){
        int[] leader = leadersInArray.find(new int[]{1,1});
        assertArrayEquals(new int[]{1,1},leader);
    }

    @Test
    public void given10_return10(){
        int[] leader = leadersInArray.find(new int[]{1,0});
        assertArrayEquals(new int[]{1,0},leader);
    }

    @Test
    public void given110_return(){
        int[] leader = leadersInArray.find(new int[]{1,1,0});
        assertArrayEquals(new int[]{1,1,0},leader);
    }

}
