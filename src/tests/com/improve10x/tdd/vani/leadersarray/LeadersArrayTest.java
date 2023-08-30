package com.improve10x.tdd.vani.leadersarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersArrayTest {
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmpty(){
        LeadersArray leadersArray = new LeadersArray();
        int[] values = leadersArray.find(null);
        assertArrayEquals(new int[]{}, values);
    }
}
