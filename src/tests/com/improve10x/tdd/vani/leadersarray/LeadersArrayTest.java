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
}
