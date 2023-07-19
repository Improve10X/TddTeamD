package com.improve10x.tdd.vani.farmproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmProblemTest {
    FarmProblem farmProblem;

    @BeforeEach
    public void setUp(){
        farmProblem = new FarmProblem();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenTwoThreeFive_returnsThirtySix(){
        int total = farmProblem.animals(2,3,5);
        assertEquals(36,total);
    }

    @Test
    public void givenOneTwoThree_returnsTwentyTwo(){
        int total = farmProblem.animals(1,2,3);
        assertEquals(22,total);
    }

    @Test
    public void givenFiveTwoEight_returnsFifty(){
        int total = farmProblem.animals(5,2,8);
        assertEquals(50,total);
    }
}
