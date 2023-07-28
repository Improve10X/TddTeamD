package com.improve10x.tdd.vani.howmanyrectangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyRectanglesTest {
    @Test
    public void nothing(){}

    @Test
    public void given0_returns0(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int number = howManyRectangles.rectangles(0);
        assertEquals(0, number);
    }
}
