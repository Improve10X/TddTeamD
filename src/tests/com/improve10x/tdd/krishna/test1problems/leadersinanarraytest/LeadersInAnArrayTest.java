package com.improve10x.tdd.krishna.test1problems.leadersinanarraytest;

import com.improve10x.tdd.krishna.test1problems.leadersinanarray.LeadersInAnArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInAnArrayTest {

    LeadersInAnArray leadersInAnArray;

    @BeforeEach
    public void setup(){
        leadersInAnArray = new LeadersInAnArray();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnsZero(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {0});
        assertArrayEquals(new int[]{0}, leaders);
    }

    @Test
    public void givenOne_returnsOne(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {1});
        assertArrayEquals(new int[]{1}, leaders);
    }

    @Test
    public void givenMinusOne_returnsMinusOne(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {-1});
        assertArrayEquals(new int[]{-1}, leaders);
    }

    @Test
    public void givenZeroZero_returnsZero(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {0 , 0});
        assertArrayEquals(new int[]{0}, leaders);
    }

    @Test
    public void givenZeroOne_returnsOne(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {0, 1});
        assertArrayEquals(new int[]{1}, leaders);
    }

    @Test
    public void givenOneTwo_returnsTwo(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {1, 2});
        assertArrayEquals(new int[]{2}, leaders);
    }

    @Disabled
    @Test
    public void givenTwoOne_returnsTwoOne(){
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {2, 1});
        assertArrayEquals(new int[]{2, 1}, leaders);
    }
}
