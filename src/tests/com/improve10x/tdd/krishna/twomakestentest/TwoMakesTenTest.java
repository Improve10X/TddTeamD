package com.improve10x.tdd.krishna.twomakestentest;

import com.improve10x.tdd.krishna.twomakesten.TwoMakesTen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {

    TwoMakesTen twoMakesTen;

    @BeforeEach
    public void setup(){
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void nothing(){

    }

    //Two Makes Ten
    //Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
    //Examples
    //makesTen(9, 10) ➞ true
    //makesTen(9, 9) ➞ false
    //makesTen(1, 9) ➞ true

    @Test
    public void givenNineTen_returnTrue(){
        boolean makesTen = twoMakesTen.twoMakesTen(9, 10);
        assertEquals(true, makesTen);
    }

    @Test
    public void givenNineNine_returnFalse(){
        boolean makesTen = twoMakesTen.twoMakesTen(9, 9);
        assertEquals(false, makesTen);
    }

    @Test
    public void givenOneNine_returnTrue(){
        boolean makesTen = twoMakesTen.twoMakesTen(1, 9);
        assertEquals(true, makesTen);
    }

    @Test
    public void givenZeroTen_returnTrue(){
        boolean makesTen = twoMakesTen.twoMakesTen(0, 10);
        assertEquals(true, makesTen);
    }
}
