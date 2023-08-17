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
    private LeftRotate leftRotate;

    @BeforeEach
    public void setUp(){
        leftRotate = new LeftRotate();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returns0(){
        int[] zero = leftRotate.findLeftRotateByArray(null);
        assertArrayEquals(new int[]{}, zero);
    }

    @Test
    public void givenEmpty_returns0(){
        int[] zero = leftRotate.findLeftRotateByArray(new int[]{});
        assertArrayEquals(new int[]{}, zero);
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
        int[] two = leftRotate.findLeftRotateByArray(new int[]{2});
        assertArrayEquals(new int[]{2}, two);
    }
    @Test
    public void given3_returns3(){
        int[] three = leftRotate.findLeftRotateByArray(new int[]{3});
        assertArrayEquals(new int[]{3}, three);
    }
    @Test
    public void given5_returns5(){
        int[] five = leftRotate.findLeftRotateByArray(new int[]{5});
        assertArrayEquals(new int[]{5}, five);
    }
    @Test
    public void given100_returns100(){
        int[] hundred = leftRotate.findLeftRotateByArray(new int[]{100});
        assertArrayEquals(new int[]{100}, hundred);
    }
    @Test
    public void given01_returns10(){
        int[] value = leftRotate.findLeftRotateByArray(new int[]{0,1});
        assertArrayEquals(new int[]{1,0}, value);
    }
    @Test
    public void given21_returns12(){
        int[] value = leftRotate.findLeftRotateByArray(new int[]{2,1});
        assertArrayEquals(new int[]{1,2}, value);
    }
    @Test
    public void given312_returns123(){
        int[] value = leftRotate.findLeftRotateByArray(new int[]{3,1,2});
        assertArrayEquals(new int[]{1,2,3}, value);
    }
    @Test
    public void given213_returns132(){
        int[] value = leftRotate.findLeftRotateByArray(new int[]{2,1,3});
        assertArrayEquals(new int[]{1,3,2}, value);
    }
    @Test
    public void given1234_returns2341(){
        int[] value = leftRotate.findLeftRotateByArray(new int[]{1,2,3,4});
        assertArrayEquals(new int[]{2,3,4,1}, value);
    }
}
