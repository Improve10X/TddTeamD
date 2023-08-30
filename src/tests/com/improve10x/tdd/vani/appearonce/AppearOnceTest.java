package com.improve10x.tdd.vani.appearonce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the number that appears once, and the other numbers twice
//        Problem Statement: Given a non-empty array of integers arr, every
//        element appears twice except for one. Find that single one.
//        Example 1:
//        Input Format: arr[] = {2,2,1}
//        Result: 1
//        Explanation: In this array, only the element 1 appear once and so it
//        is the answer.
//        Example 2:
//        Input Format: arr[] = {4,1,2,1,2}
//        Result: 4
//        Explanation: In this array, only element 4 appear once and the other
//        elements appear twice. So, 4 is the answer.

public class AppearOnceTest {
    final int invalid = -1;
    private AppearOnce appearOnce;
    @BeforeEach
    public void setUp(){
        appearOnce = new AppearOnce();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmpty(){
        int value = appearOnce.find(null);
        assertEquals(invalid,value);
    }
}
