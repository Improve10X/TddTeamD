package com.improve10x.tdd.supriya.arrayqustions.duplicateelement;

import com.improve10x.tdd.supriya.arrayquestions.duplicateelement.DuplicateElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//Remove Duplicates in-place from Sorted Array
//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates
// in place such that each unique element appears only once. The relative order of the elements
// should be kept the same.
public class DuplicateElementTest {
    DuplicateElement duplicateElement;
    @BeforeEach
    public void setUP(){
        duplicateElement = new DuplicateElement();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        int[] element = duplicateElement.find(null);
        assertArrayEquals(new int[] {}, element);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        int[] element = duplicateElement.find(new int[]{});
        assertArrayEquals(new int[] {}, element);
    }

    @Test
    public void given0_return0(){
        int[] element = duplicateElement.find(new int[]{0});
        assertArrayEquals(new int[] {0}, element);
    }

    @Test
    public void given1_return1(){
        int[] element = duplicateElement.find(new int[]{1});
        assertArrayEquals(new int[] {1}, element);
    }

    @Test
    public void given11_return1(){
        int[] element = duplicateElement.find(new int[]{1,1});
        assertArrayEquals(new int[] {1}, element);
    }

    @Test
    public void given12_return12(){
        int[] element = duplicateElement.find(new int[]{1,2});
        assertArrayEquals(new int[] {1,2}, element);
    }

    @Test
    public void given112_return12(){
        int[] element = duplicateElement.find(new int[]{1,1,2});
        assertArrayEquals(new int[] {1,2}, element);
    }

    @Test
    public void given122_return12(){
        int[] element = duplicateElement.find(new int[]{1,2,2});
        assertArrayEquals(new int[] {1,2}, element);
    }

    @Test
    public void given123_return123(){
        int[] element = duplicateElement.find(new int[]{1,2,3});
        assertArrayEquals(new int[] {1,2,3}, element);
    }
    @Disabled
    @Test
    public void given1123_return12(){
        int[] element = duplicateElement.find(new int[]{1,1,2,3});
        assertArrayEquals(new int[] {1,2,3}, element);
    }
}
