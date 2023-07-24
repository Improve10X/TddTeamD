package com.improve10x.tdd.supriya.practice.arethenumbersequal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreTheNumbersEqualTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZeroZero_returnTrue(){
        AreTheNumbersEqual areTheNumbersEqual = new AreTheNumbersEqual();
        boolean status = areTheNumbersEqual.findStatus(0,0);
        Assertions.assertEquals(true, status);
    }

    @Test
    public void givenZeroOne_returnFalse(){
        AreTheNumbersEqual areTheNumbersEqual = new AreTheNumbersEqual();
        boolean status = areTheNumbersEqual.findStatus(0,1);
        Assertions.assertEquals(false, status);
    }

    @Test
    public void givenFourEight_returnFalse(){
        AreTheNumbersEqual areTheNumbersEqual = new AreTheNumbersEqual();
        boolean status = areTheNumbersEqual.findStatus(4,8);
        Assertions.assertEquals(false, status);
    }

    @Test
    public void givenTwoTwo_returnTrue(){
        AreTheNumbersEqual areTheNumbersEqual = new AreTheNumbersEqual();
        boolean status = areTheNumbersEqual.findStatus(2,2);
        Assertions.assertEquals(true, status);
    }
}
