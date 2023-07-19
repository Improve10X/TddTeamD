package com.improve10x.tdd.vani.mathoperations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    @Test
    public void add() {
        MathOperations math = new MathOperations();
    }

    @Test
    public void nothing() {
    }

    //    0,0 -> 0
    @Test
    public void givenZeroZero_returnsZero() {
        MathOperations math = new MathOperations();
        int sum = math.add(0,0);
        Assertions.assertEquals(0,sum);
    }

    //    1,0 -> 1
    @Test
    public void givenOneZero_returnsOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(1,0);
        Assertions.assertEquals(1,sum);
    }

    //    0,1 -> 1
    @Test
    public void givenZeroOne_returnsOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(0,1);
        Assertions.assertEquals(1,sum);
    }

    //    1,1 -> 2
    @Test
    public void givenOneOne_returnsTwo(){
        MathOperations math = new MathOperations();
        int sum = math.add(1,1);
        Assertions.assertEquals(2,sum);
    }

    @Test
    public void sub(){
        MathOperations math = new MathOperations();
    }

    @Test
    public void subNothing(){}

    //  0,0 -> 0
    @Test
    public void givenZeroZero_returnZero(){
        MathOperations math = new MathOperations();
        int sub = math.sub(0,0);
        Assertions.assertEquals(0,sub);
    }

    //    1,0 -> 1
    @Test
    public void givenOneZero_returnOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(1,0);
        Assertions.assertEquals(1,sub);
    }

    //    0,1 -> -1
    @Test
    public void givenZeroOne_returnNegativeOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(0,1);
        Assertions.assertEquals(-1,sub);
    }

    //    1,1 -> 0
    @Test
    public void givenOneOne_returnOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(1,1);
        Assertions.assertEquals(0,sub);
    }

    @Test
    public void multi () {
        MathOperations math = new MathOperations();
    }

    @Test
    public void multiNothing(){}

    //    0,0 -> 0
    @Test
    public void givenZeroZero_returnBackZero(){
        MathOperations math = new MathOperations();
        int multi = math.multi(0,0);
        Assertions.assertEquals(0,multi);
    }

    //    5,1 -> 5
    @Test
    public void givenOneZero_returnBackZero(){
        MathOperations math = new MathOperations();
        int multi = math.multi(5,1);
        Assertions.assertEquals(5,multi);
    }

    //    1,5 -> 5
    @Test
    public void givenOneFive_returnBackFive(){
        MathOperations math = new MathOperations();
        int multi = math.multi(1,5);
        Assertions.assertEquals(5,multi);
    }

    //    5, 5- > 25
    @Test
    public void givenTwoTwo_returnBackFour(){
        MathOperations math = new MathOperations();
        int multi = math.multi(5,5);
        Assertions.assertEquals(25,multi);
    }
}
