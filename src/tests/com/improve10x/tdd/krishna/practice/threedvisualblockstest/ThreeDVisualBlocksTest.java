package com.improve10x.tdd.krishna.practice.threedvisualblockstest;

import com.improve10x.tdd.krishna.practice.threedvisualblocks.ThreeDVisualBlocks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeDVisualBlocksTest {

    ThreeDVisualBlocks threeDVisualBlocks;

    @BeforeEach
    public void setThreeDVisualBlocks(){
        threeDVisualBlocks = new ThreeDVisualBlocks();
    }

    @Test
    public void nothing(){
    }
    @Test
    public void givenZero_returnsZero(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(0);
        assertEquals(0, noOfBlocks);
    }
    @Test
    public void givenOne_returnsFive(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(1);
        assertEquals(5, noOfBlocks);
    }
    @Test
    public void givenTwo_returnsTwelve(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(2);
        assertEquals(12, noOfBlocks);
    }
    @Test
    public void givenThree_returnsTwenty(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(3);
        assertEquals(20, noOfBlocks);
    }
    @Test
    public void givenFour_returnsTwentyNine(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(4);
        assertEquals(29, noOfBlocks);
    }
    @Test
    public void givenFive_returnsThirtyNine(){
        int noOfBlocks = threeDVisualBlocks.find3DVisualBlocks(5);
        assertEquals(39, noOfBlocks);
    }
}
