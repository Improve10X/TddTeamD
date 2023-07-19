package com.improve10x.tdd.supriya.framespersecondtest;

import com.improve10x.tdd.supriya.framesforsecond.FramesPerSecond;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FramesPerSecondTest {
    @Test
    public void givenOneOne_returnSixty(){
        FramesPerSecond framesPerSeconds = new FramesPerSecond();
        int seconds = framesPerSeconds.calculate(1,1);
        Assertions.assertEquals(60, seconds);
    }

    @Test
    public void givenTenOne_returnSixHundred(){
        FramesPerSecond framesPerSeconds = new FramesPerSecond();
        int seconds = framesPerSeconds.calculate(10,1);
        Assertions.assertEquals(600, seconds);
    }

    @Test
    public void givenTenTwentyFive_returnFifteenThousand(){
        FramesPerSecond framesPerSeconds = new FramesPerSecond();
        int seconds = framesPerSeconds.calculate(10,25);
        Assertions.assertEquals(15000, seconds);
    }

}
