package com.improve10x.tdd.supriya.edgeofatriangletest;

import com.improve10x.tdd.supriya.edgeofatriangle.EdgeOfATriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeOfATriangleTest {
    @Test
    public void givenFiveSeven_returnsLeven(){
        EdgeOfATriangle edgeOfATriangle = new EdgeOfATriangle();
        int triangle = edgeOfATriangle.findCalculate(5,7);
        Assertions.assertEquals(11, triangle);
    }

    @Test
    public void givenNineTwo_returnsTen(){
        EdgeOfATriangle edgeOfATriangle = new EdgeOfATriangle();
        int triangle = edgeOfATriangle.findCalculate(9,2);
        Assertions.assertEquals(10, triangle);
    }

    @Test
    public void givenEightTen_returnsSeventeen(){
        EdgeOfATriangle edgeOfATriangle = new EdgeOfATriangle();
        int triangle = edgeOfATriangle.findCalculate(8,10);
        Assertions.assertEquals(17, triangle);
    }
}
