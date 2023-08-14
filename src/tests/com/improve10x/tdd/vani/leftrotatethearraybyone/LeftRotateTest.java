package com.improve10x.tdd.vani.leftrotatethearraybyone;

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

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returns0(){
        LeftRotate leftRotate = new LeftRotate();
        int[] zero = leftRotate.findLeftRotateByArray(null);
        assertArrayEquals(new int[]{0}, zero);
    }
}
