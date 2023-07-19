package com.improve10x.tdd.krishna.mathoperationstest;

import com.improve10x.tdd.krishna.mathoperations.MathOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {

    @Test
    public void test(){
        MathOperations math = new MathOperations();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void addGivenZeroZero_returnsZero(){
        MathOperations math = new MathOperations();
        int sum = math.add(0 ,0);
        Assertions.assertEquals(0 ,sum);
    }

    @Test
    public void addGivenOneZero_returnsOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(1 , 0);
        Assertions.assertEquals(1 , sum);
    }

    @Test
    public void addGivenZeroOne_returnsOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(0 , 1);
        Assertions.assertEquals(1 , sum);
    }

    @Test
    public void addGivenOneOne_returnsTwo(){
        MathOperations math = new MathOperations();
        int sum = math.add(1 , 1);
        Assertions.assertEquals(2 , sum);
    }

    @Test
    public void subtractionGivenZeroZero_returnsZero(){
        MathOperations math = new MathOperations();
        int subtraction = math.subtraction(0 , 0);
        Assertions.assertEquals(0 ,subtraction);
    }

    @Test
    public void subtractionGivenOneZero_returnsOne(){
        MathOperations math = new MathOperations();
        int subtraction = math.subtraction(1 , 0);
        Assertions.assertEquals(1 ,subtraction);
    }

    @Test
    public void subtractionGivenZeroOne_returnsNegativeOne(){
        MathOperations math = new MathOperations();
        int subtraction = math.subtraction(0 , 1);
        Assertions.assertEquals(-1 ,subtraction);
    }

    @Test
    public void subtractionGivenOneOne_returnsZero(){
        MathOperations math = new MathOperations();
        int subtraction = math.subtraction(1 , 1);
        Assertions.assertEquals(0  , subtraction);
    }

    @Test
    public void multiplyGivenZeroZero_returnsZero(){
        MathOperations math = new MathOperations();
        int multiplication = math.multiply(0 ,0);
        Assertions.assertEquals(0 , multiplication);
    }

    @Test
    public void multiplyGivenOneZero_returnsZero(){
        MathOperations math = new MathOperations();
        int multiplication = math.multiply(1 ,0);
        Assertions.assertEquals(0 , multiplication);
    }

    @Test
    public void multiplyGivenZeroOne_returnsZero(){
        MathOperations math = new MathOperations();
        int multiplication = math.multiply(0 ,1);
        Assertions.assertEquals(0 , multiplication);
    }

    @Test
    public void multiplyGivenOneOne_returnsOne(){
        MathOperations math = new MathOperations();
        int multiplication = math.multiply(1 ,1);
        Assertions.assertEquals(1 , multiplication);
    }

}
