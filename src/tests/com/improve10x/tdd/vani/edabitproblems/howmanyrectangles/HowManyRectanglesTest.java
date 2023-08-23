package com.improve10x.tdd.vani.edabitproblems.howmanyrectangles;

import com.improve10x.tdd.vani.edabitproblems.howmanyrectangles.HowManyRectangles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//How Many Rectangles?
//        Let there be a square matrix, where each square is a rectangle, and a combination of more squares are also rectangles. To find the number of rectangles, Pete sat down and started counting... but that's highly inefficient.
//        Create a function that takes the order of the matrix as input and returns the number of rectangles in them.
//        Examples
//        rectangles(1) ➞ 1
//        rectangles(2) ➞ 9
//        rectangles(3) ➞ 36

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyRectanglesTest {
    HowManyRectangles howManyRectangles;
    @BeforeEach
    public void setUp(){
        howManyRectangles = new HowManyRectangles();
    }
    @Test
    public void nothing(){}

    @Test
    public void given0_returns0(){
        int number = howManyRectangles.rectangles(0);
        assertEquals(0, number);
    }
    @Test
    public void given1_returns1(){
        int number = howManyRectangles.rectangles(1);
        assertEquals(1, number);
    }
    @Test
    public void given2_returns9(){
        int number = howManyRectangles.rectangles(2);
        assertEquals(9, number);
    }
    @Test
    public void given3_returns36(){
        int number = howManyRectangles.rectangles(3);
        assertEquals(36, number);
    }
    @Test
    public void given4_returns100(){
        int number = howManyRectangles.rectangles(4);
        assertEquals(100, number);
    }
    @Test
    public void given5_returns225(){
        int number = howManyRectangles.rectangles(5);
        assertEquals(225, number);
    }
}
