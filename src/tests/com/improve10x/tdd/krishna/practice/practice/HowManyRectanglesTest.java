package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyRectanglesTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnsZero(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int noOfRectangle = howManyRectangles.findNoOfRectangles(0);
        assertEquals(0, noOfRectangle);
    }

    @Test
    public void givenOne_returnsOne(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int noOfRectangle = howManyRectangles.findNoOfRectangles(1);
        assertEquals(1, noOfRectangle);
    }
}
