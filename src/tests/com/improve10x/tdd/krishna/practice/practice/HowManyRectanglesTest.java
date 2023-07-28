package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyRectanglesTest {

    HowManyRectangles howManyRectangles;

    @BeforeEach
    public void setup(){
        howManyRectangles = new HowManyRectangles();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnsZero(){
        int noOfRectangle = howManyRectangles.findNoOfRectangles(0);
        assertEquals(0, noOfRectangle);
    }

    @Test
    public void givenOne_returnsOne(){
        int noOfRectangle = howManyRectangles.findNoOfRectangles(1);
        assertEquals(1, noOfRectangle);
    }

    @Test
    public void givenTwo_returnsNine(){
        int noOfRectangle = howManyRectangles.findNoOfRectangles(2);
        assertEquals(9, noOfRectangle);
    }

    @Test
    public void givenThree_returnsThirtySix(){
        int noOfRectangle = howManyRectangles.findNoOfRectangles(3);
        assertEquals(36, noOfRectangle);
    }

    @Test
    public void givenFour_returns100(){
        int noOfRectangle = howManyRectangles.findNoOfRectangles(4);
        assertEquals(100, noOfRectangle);
    }
}
