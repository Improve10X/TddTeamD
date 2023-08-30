package com.improve10x.tdd.krishna.test2problems.leadersinarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInArrayTest {

    private LeadersInArray leadersInArray;

    @BeforeEach
    public void setup(){
        leadersInArray = new LeadersInArray();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        int[] leaders = leadersInArray.findLeaders(null);
        assertArrayEquals(new int[]{}, leaders);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        int[] leaders = leadersInArray.findLeaders(new int[]{});
        assertArrayEquals(new int[]{}, leaders);
    }

    @Test
    public void given0_returns0(){
        int[] leaders = leadersInArray.findLeaders(new int[]{0});
        assertArrayEquals(new int[]{0}, leaders);
    }

    @Test
    public void given1_returns1(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1});
        assertArrayEquals(new int[]{1}, leaders);
    }

    @Test
    public void given01_returns01(){
        int[] leaders = leadersInArray.findLeaders(new int[]{0, 1});
        assertArrayEquals(new int[]{1}, leaders);
    }
}
