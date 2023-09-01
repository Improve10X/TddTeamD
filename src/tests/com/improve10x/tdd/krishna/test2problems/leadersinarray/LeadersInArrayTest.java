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

    @Test
    public void given10_returns10(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 0});
        assertArrayEquals(new int[]{1, 0}, leaders);
    }

    @Test
    public void given11_returns11(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 1});
        assertArrayEquals(new int[]{1, 1}, leaders);
    }

    @Test
    public void given012_returns2(){
        int[] leaders = leadersInArray.findLeaders(new int[]{0, 1, 2});
        assertArrayEquals(new int[]{2}, leaders);
    }

    @Test
    public void given102_returns2(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 0, 2});
        assertArrayEquals(new int[]{2}, leaders);
    }

    @Test
    public void given121_returns2(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 2, 1});
        assertArrayEquals(new int[]{2}, leaders);
    }
    @Test
    public void given211_returns2(){
        int[] leaders = leadersInArray.findLeaders(new int[]{2, 1, 1});
        assertArrayEquals(new int[]{2}, leaders);
    }

    @Test
    public void given1234_returns4(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{4}, leaders);
    }

    @Test
    public void given1243_returns4(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 2, 4, 3});
        assertArrayEquals(new int[]{4}, leaders);
    }

    @Test
    public void given1423_returns4(){
        int[] leaders = leadersInArray.findLeaders(new int[]{1, 4, 2, 3});
        assertArrayEquals(new int[]{4}, leaders);
    }

    @Test
    public void given4123_returns4(){
        int[] leaders = leadersInArray.findLeaders(new int[]{4, 1, 2, 3});
        assertArrayEquals(new int[]{4}, leaders);
    }
}
