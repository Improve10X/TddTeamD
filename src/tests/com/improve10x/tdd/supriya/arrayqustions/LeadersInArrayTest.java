package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.leadersinarray.LeadersInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeadersInArrayTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_return0(){
        LeadersInArray leadersInArray = new LeadersInArray();
        int[] leader = leadersInArray.find(null);
        Assertions.assertArrayEquals(new int[]{0},leader);
    }
}
