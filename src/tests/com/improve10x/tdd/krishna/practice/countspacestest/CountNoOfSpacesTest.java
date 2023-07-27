package com.improve10x.tdd.krishna.practice.countspacestest;

import com.improve10x.tdd.krishna.practice.countnoofspcaces.CountNoOfSpaces;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNoOfSpacesTest {

    CountNoOfSpaces countNoOfSpaces;

    @BeforeEach
    public void setup(){
        countNoOfSpaces = new CountNoOfSpaces();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returns0(){
        int noOfSpaces = countNoOfSpaces.count(null);
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givenString_returns(){
        int noOfSpaces = countNoOfSpaces.count("");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givenEmpty_returns1(){
        int noOfSpaces = countNoOfSpaces.count(" ");
        assertEquals(1, noOfSpaces);
    }

    @Test
    public void givena_returns0(){
        int noOfSpaces = countNoOfSpaces.count("a");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givenB_returns0(){
        int noOfSpaces = countNoOfSpaces.count("B");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givenaa_returns0(){
        int noOfSpaces = countNoOfSpaces.count("aa");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givenaB_returns0(){
        int noOfSpaces = countNoOfSpaces.count("aB");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givensurya_returns0(){
        int noOfSpaces = countNoOfSpaces.count("surya");
        assertEquals(0, noOfSpaces);
    }

    @Test
    public void givensuryaWithSingleSpace_returns1(){
        int noOfSpaces = countNoOfSpaces.count("surya ");
        assertEquals(1, noOfSpaces);
    }

    @Test
    public void givensuryaWithSingleSpaceKarthik_returns1(){
        int noOfSpaces = countNoOfSpaces.count("surya karthik");
        assertEquals(1, noOfSpaces);
    }

    @Test
    public void givenDoubleSpace_returns2(){
        int noOfSpaces = countNoOfSpaces.count("  ");
        assertEquals(2, noOfSpaces);
    }
}
