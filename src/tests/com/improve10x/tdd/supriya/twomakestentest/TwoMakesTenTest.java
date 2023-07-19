package com.improve10x.tdd.supriya.twomakestentest;

import com.improve10x.tdd.supriya.twomakesten.TwoMakesTen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoMakesTenTest {
    TwoMakesTen twoMakes;

    @BeforeEach
    public void setUp(){
        twoMakes = new TwoMakesTen();
    }

    @Test
    public void nothing(){
    }
    //    input-> 1,10 output-> boolean
    @Test
    public void givenOneTen_returnsTrue(){
        boolean makesTen = twoMakes.findStatus(1,10);
        Assertions.assertEquals(true, makesTen);
    }

    @Test
    public void givenNineTen_returnsTrue(){
        boolean makesTen = twoMakes.findStatus(9,10);
        Assertions.assertEquals(true, makesTen);
    }

}
