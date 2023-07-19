package com.improve10x.tdd.krishna.maxedgetriangletest;

import com.improve10x.tdd.krishna.maxedgetriangle.MaxEdgeOfTriangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxEdgeTriangleTest {

    MaxEdgeOfTriangle maxEdgeOfTriangle;

    @BeforeEach
    public void setup(){
        maxEdgeOfTriangle = new MaxEdgeOfTriangle();
    }

    @Test
    public void nothing(){

    }
    //Maximum Edge of a Triangle
//Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
//Examples
//nextEdge(8, 10) ➞ 17
//nextEdge(5, 7) ➞ 11
//nextEdge(9, 2) ➞ 10
    // (side1 + side2) - 1 = result
    @Test
    public void givenEightTen_returnSeventeen(){
        int maxEdge = maxEdgeOfTriangle.findMaxEdgeOfTriangle(8, 10);
        assertEquals(17, maxEdge);
    }

    @Test
    public void givenFiveSeven_returnEleven(){
        int maxEdge = maxEdgeOfTriangle.findMaxEdgeOfTriangle(5, 7);
        assertEquals(11, maxEdge);
    }

    @Test
    public void givenNineTwo_returnTen(){
        int maxEdge = maxEdgeOfTriangle.findMaxEdgeOfTriangle(9,2);
        assertEquals(10, maxEdge);
    }
}
