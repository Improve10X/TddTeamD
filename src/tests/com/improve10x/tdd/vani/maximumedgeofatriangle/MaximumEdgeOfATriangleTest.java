package com.improve10x.tdd.vani.maximumedgeofatriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumEdgeOfATriangleTest {
    MaximumEdgeOfATriangle maximumEdgeOfATriangle;

    @BeforeEach
    public void setUp(){
        maximumEdgeOfATriangle = new MaximumEdgeOfATriangle();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenEightTen_returnsOneSeven(){
        int triangle = maximumEdgeOfATriangle.nextEdge(8,10);
        assertEquals(17, triangle);
    }

    @Test
    public void givenFiveSeven_returnsEleven(){
        int triangle = maximumEdgeOfATriangle.nextEdge(5,7);
        assertEquals(11,triangle);
    }

    @Test
    public void givenNineTwo_returnsTen(){
        int triangle = maximumEdgeOfATriangle.nextEdge(9,2);
        assertEquals(10,triangle);
    }
}
