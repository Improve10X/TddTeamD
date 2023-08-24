package com.improve10x.tdd.vani.movezerostoend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//Move all Zeros to the end of the array
//        In this article we will learn how to solve the most asked
//        coding interview problem: “Move all Zeros to the end of the array”
//        Problem Statement: You are given an array of integers,
//        your task is to move all the zeros in the array to the end of the array
//        and move non-negative integers to the front by maintaining their order.
//        Example 1:
//        Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//        Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
//        Explanation: All the zeros are moved to the end and non-negative integers
//        are moved to front by maintaining order
//        Example 2:
//        Input: 1,2,0,1,0,4,0
//        Output: 1,2,1,4,0,0,0
//        Explanation: All the zeros are moved to the end and non-negative integers
//        are moved to front by maintaining order

public class MoveZerosToEndTest {
    private MoveZerosToEnd moveZerosToEnd;
    @BeforeEach
    public void setUp(){
        moveZerosToEnd = new MoveZerosToEnd();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmpty(){
        int[] array = moveZerosToEnd.find(null);
        assertArrayEquals(new int[]{},array);
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        int[] array = moveZerosToEnd.find(new int[]{});
        assertArrayEquals(new int[]{},array);
    }
    @Test
    public void given0_returns0(){
        int[] array = moveZerosToEnd.find(new int[]{0});
        assertArrayEquals(new int[]{0},array);
    }
    @Test
    public void given01_returns10(){
        int[] array = moveZerosToEnd.find(new int[]{0,1});
        assertArrayEquals(new int[]{1,0},array);
    }
    @Test
    public void given10_returns10(){
        int[] array = moveZerosToEnd.find(new int[]{1,0});
        assertArrayEquals(new int[]{1,0},array);
    }
    @Test
    public void given101_returns110(){
        int[] array = moveZerosToEnd.find(new int[]{1,0,1});
        assertArrayEquals(new int[]{1,1,0},array);
    }
    @Test
    public void given110_returns110(){
        int[] array = moveZerosToEnd.find(new int[]{1,1,0});
        assertArrayEquals(new int[]{1,1,0},array);
    }
    @Test
    public void given111_returns111(){
        int[] array = moveZerosToEnd.find(new int[]{1,1,1});
        assertArrayEquals(new int[]{1,1,1},array);
    }

}
