package com.improve10x.tdd.krishna.test2problems.leadersinarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInArrayTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        LeadersInArray leadersInArray = new LeadersInArray();
        int[] leaders = leadersInArray.findLeaders(null);
        assertArrayEquals(new int[]{}, leaders);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        LeadersInArray leadersInArray = new LeadersInArray();
        int[] leaders = leadersInArray.findLeaders(new int[]{});
        assertArrayEquals(new int[]{}, leaders);
    }

    @Test
    public void given0_returns0(){
        LeadersInArray leadersInArray = new LeadersInArray();
        int[] leaders = leadersInArray.findLeaders(new int[]{0});
        assertArrayEquals(new int[]{0}, leaders);
    }
}
