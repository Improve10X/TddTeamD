package com.improve10x.tdd.krishna.practice.countspacestest;

import com.improve10x.tdd.krishna.practice.countnoofspcaces.CountNoOfSpaces;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNoOfSpacesTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returns(){
        CountNoOfSpaces countNoOfSpaces = new CountNoOfSpaces();
        int noOfSpaces = countNoOfSpaces.count(null);
        assertEquals(0, noOfSpaces);
    }
}
