package com.improve10x.tdd.vani.twomakesten;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {
    TwoMakesTen twoMakesTen;

    @BeforeEach
    public void setUp(){
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNineTen_returnsTrue(){
        boolean makes = twoMakesTen.sumOfNumbers(9, 10);
        assertEquals(true,makes);
    }

    @Test
    public void givenNineNine_returnsFalse(){
        boolean makes = twoMakesTen.sumOfNumbers(9, 9);
        assertEquals(false,makes);
    }

    @Test
    public void givenOneNine_returnsFalse(){
        boolean makes = twoMakesTen.sumOfNumbers(1, 9);
        assertEquals(true,makes);
    }
}
