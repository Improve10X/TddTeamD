package com.improve10x.tdd.krishna.test1problems.leadersinanarraytest;

import com.improve10x.tdd.krishna.test1problems.leadersinanarray.LeadersInAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInAnArrayTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnsZero(){
        LeadersInAnArray leadersInAnArray = new LeadersInAnArray();
        int[] leaders = leadersInAnArray.findLeadersInAnArray(new int[] {0});
        assertArrayEquals(new int[]{0}, leaders);
    }
}
