package com.improve10x.tdd.supriya.practice.lessthanhundred;

import com.improve10x.tdd.supriya.practice.lessthan100.LessThanHundred;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessThanHundredTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZeroOne_returnTrue(){
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean status = lessThanHundred.findStatus(0,1);
        assertEquals(true, status);
    }
}
