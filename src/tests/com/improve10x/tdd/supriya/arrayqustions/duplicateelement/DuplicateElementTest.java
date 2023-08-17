package com.improve10x.tdd.supriya.arrayqustions.duplicateelement;

import com.improve10x.tdd.supriya.arrayquestions.duplicateelement.DuplicateElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//Remove Duplicates in-place from Sorted Array
//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates
// in place such that each unique element appears only once. The relative order of the elements
// should be kept the same.
public class DuplicateElementTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(null);
        Assertions.assertArrayEquals(new int[] {}, element);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{});
        Assertions.assertArrayEquals(new int[] {}, element);
    }

    @Test
    public void given0_return0(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{0});
        Assertions.assertArrayEquals(new int[] {0}, element);
    }

    @Test
    public void given1_return1(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{1});
        Assertions.assertArrayEquals(new int[] {1}, element);
    }

    @Test
    public void given11_return1(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{1,1});
        Assertions.assertArrayEquals(new int[] {1}, element);
    }

    @Test
    public void given12_return12(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{1,2});
        Assertions.assertArrayEquals(new int[] {1,2}, element);
    }

    @Test
    public void given112_return12(){
        DuplicateElement duplicateElement = new DuplicateElement();
        int[] element = duplicateElement.find(new int[]{1,1,2});
        Assertions.assertArrayEquals(new int[] {1,2}, element);
    }
}
