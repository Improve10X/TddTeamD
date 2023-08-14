package com.improve10x.tdd.vani.leftrotatethearraybyone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//Left Rotate the Array by One
//        Problem Statement: Given an array of N integers, left rotate the array by one place.
//        Examples
//        Example 1:
//        Input: N = 5, array[] = {1,2,3,4,5}
//        Output: 2,3,4,5,1
//        Example 2:
//        Input: N = 1, array[] = {3}
//        Output: 3

public class LeftRotateTest {
    LeftRotate leftRotate;

    @BeforeEach
    public void setUp(){
        leftRotate = new LeftRotate();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returns0(){
        int[] zero = leftRotate.findLeftRotateByArray(null);
        assertArrayEquals(new int[]{0}, zero);
    }

    @Test
    public void givenEmpty_returns0(){
        int[] zero = leftRotate.findLeftRotateByArray(new int[]{});
        assertArrayEquals(new int[]{0}, zero);
    }
    @Test
    public void given0_returns0(){
        int[] zero = leftRotate.findLeftRotateByArray(new int[]{0});
        assertArrayEquals(new int[]{0}, zero);
    }
    @Test
    public void given1_returns1(){
        int[] one = leftRotate.findLeftRotateByArray(new int[]{1});
        assertArrayEquals(new int[]{1}, one);
    }
    @Test
    public void given2_returns2(){
        int[] one = leftRotate.findLeftRotateByArray(new int[]{2});
        assertArrayEquals(new int[]{2}, one);
    }

}
