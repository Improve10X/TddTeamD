package com.improve10x.tdd.krishna.framespersecondtest;

import com.improve10x.tdd.krishna.framespersecond.FramesPerSecond;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FramesPerSecondTest {

    FramesPerSecond framesPerSecond;

    @BeforeEach
    public void setup(){
        framesPerSecond = new FramesPerSecond();
    }
//Frames Per Second
//Create a method that returns the number of frames shown in a given number of minutes for a certain FPS.
//Examples
//frames(1, 1) ➞ 60
//frames(10, 1) ➞ 600
//frames(10, 25) ➞ 15000

    @Test
    public void givenOneOne_SixZero(){
        int seconds = framesPerSecond.findFramesPerSecond(1,1);
        assertEquals(60, seconds);
    }

    @Test
    public void givenTenOne_returnsSixZeroZero(){
        int seconds = framesPerSecond.findFramesPerSecond(10,1);
        assertEquals(600, seconds);
    }
    @Test
    public void givenTenTwentyFive_returnOneFiveZeroZeroZero(){
        int seconds = framesPerSecond.findFramesPerSecond(10,25);
        assertEquals(15000, seconds);
    }
}
