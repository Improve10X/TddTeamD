package com.improve10x.tdd.supriya.practice.howmanyrectanglestest;

import com.improve10x.tdd.supriya.practice.howmanyrectangles.HowManyRectangles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HowManyRectanglesTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(0);
        Assertions.assertEquals(0, rectangles);
    }

    @Test
    public void givenOne_returnOne(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(1);
        Assertions.assertEquals(1, rectangles);
    }

    @Test
    public void givenTwo_returnSix(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(2);
        Assertions.assertEquals(9, rectangles);
    }

    @Test
    public void givenThree_returnThirtySix(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(3);
        Assertions.assertEquals(36, rectangles);
    }

    @Test
    public void givenFour_returnHundred(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(4);
        Assertions.assertEquals(100, rectangles);
    }

    @Test
    public void givenFive_return225(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(5);
        Assertions.assertEquals(225, rectangles);
    }

    @Test
    public void givenTen_return3025(){
        HowManyRectangles howManyRectangles = new HowManyRectangles();
        int rectangles = howManyRectangles.findRectangles(10);
        Assertions.assertEquals(3025, rectangles);
    }
}
