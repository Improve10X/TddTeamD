package com.improve10x.tdd.vani.edabitproblems.framespersecond;

import com.improve10x.tdd.vani.edabitproblems.framespersecond.FramesPerSecond;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FramesPerSecondTest {
    FramesPerSecond framesPerSecond;

    @BeforeEach
    public void setUp() {
        framesPerSecond = new FramesPerSecond();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenOneOne_returnsSeconds() {
        int seconds = framesPerSecond.frames(1, 1);
        assertEquals(60, seconds);
    }

    @Test
    public void givenTenOne_returnsSeconds() {
        int seconds = framesPerSecond.frames(10, 1);
        assertEquals(600, seconds);
    }

    @Test
    public void givenTenTwentyFive_returnsSeconds() {
        int seconds = framesPerSecond.frames(10, 25);
        assertEquals(15000, seconds);
    }

}
