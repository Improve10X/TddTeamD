package com.improve10x.tdd.supriya.mathoperationstest;

import com.improve10x.tdd.supriya.mathOperations.MathOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    @Test
    public void add(){
        MathOperations math = new MathOperations();
    }
    @Test
    public void nothing(){}
    //    0,0 -> 0
    @Test
    public void addGivenZeroZero_ReturnZero(){
        MathOperations math = new MathOperations();
        int sum = math.add(0,0);
        Assertions.assertEquals(0,sum);
    }

    //1,0 -> 1
    @Test
    public void addGivenOneZero_ReturnOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(1,0);
        Assertions.assertEquals(1,sum);
    }
    // 0,1 -> 1
    @Test
    public void addGivenZeroOne_ReturnOne(){
        MathOperations math = new MathOperations();
        int sum = math.add(0,1);
        Assertions.assertEquals(1,sum);
    }
    // 1,1 ->2
    @Test
    public void addGivenOneOne_ReturnTwo(){
        MathOperations math = new MathOperations();
        int sum = math.add(1,1);
        Assertions.assertEquals(2,sum);
    }

    @Test
    public void getSubtraction(){
        MathOperations math = new MathOperations();
    }
    //    0,0->0
    @Test
    public void subtractionGivenZeroZero_ReturnZero(){
        MathOperations math = new MathOperations();
        int sub = math.sub(0, 0);
        Assertions.assertEquals(0, sub);
    }

    //    1,0 ->1
    @Test
    public void subtractionGivenOneZero_ReturnOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(1, 0);
        Assertions.assertEquals(1, sub);
    }
    //    0,1 -> -1
    @Test
    public void subtractionGivenZeroOne_ReturnNagitiveOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(0, 1);
        Assertions.assertEquals(-1, sub);
    }
    //    1,1-> 0
    @Test
    public void subtractionGivenOneOne_ReturnOne(){
        MathOperations math = new MathOperations();
        int sub = math.sub(1, 1);
        Assertions.assertEquals(0, sub);
    }

    @Test
    public void getMultiple(){
        MathOperations math = new MathOperations();
    }

    //    1,1 ->1
    @Test
    public void givenOneOne_returnOne(){
        MathOperations math = new MathOperations();
        int mul = math.multiple(1,1);
        Assertions.assertEquals(1,mul);
    }

    //1,2 ->2
    @Test
    public void givenOneTwo_returnTwo(){
        MathOperations math = new MathOperations();
        int mul = math.multiple(1,2);
        Assertions.assertEquals(2,mul);
    }
    // 1,3 ->3
    @Test
    public void givenOneThree_returnThree(){
        MathOperations math = new MathOperations();
        int mul = math.multiple(1,3);
        Assertions.assertEquals(3,mul);
    }
    // 2,3 ->
    @Test
    public void givenTwoThree_returnSix(){
        MathOperations math = new MathOperations();
        int mul = math.multiple(2,3);
        Assertions.assertEquals(6,mul);
    }

}
