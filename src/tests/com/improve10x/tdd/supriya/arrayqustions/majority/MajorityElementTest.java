package com.improve10x.tdd.supriya.arrayqustions.majority;

import com.improve10x.tdd.supriya.arrayquestions.majority.MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//Problem Statement: Given an array of N integers, write a program to return an element
// that occurs more than N/2 times in the given array. You may consider that
// such an element always exists in the array.
//Examples
//Example 1:
//Input Format: N = 3, nums[] = {3,2,3}
//Result: 3
//Explanation: When we just count the occurrences of each number and compare with
// half of the size of the array, you will get 3 for the above solution.


public class MajorityElementTest {
    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(null);
        Assertions.assertEquals(-1, element);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{});
        Assertions.assertEquals(-1, element);
    }

    @Test
    public void given0_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[0]);
        Assertions.assertEquals(-1, element);
    }

    @Test
    public void given1_return1() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{1});
        Assertions.assertEquals(1, element);
    }

    @Test
    public void given5_return5() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{5});
        Assertions.assertEquals(5, element);
    }

    @Test
    public void given01_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{0, 1});
        Assertions.assertEquals(-1, element);
    }

    @Test
    public void given11_returnOne() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{1, 1});
        Assertions.assertEquals(1, element);
    }

    @Test
    public void given12_return2() {//1,2 = 2/2 = 1
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{1, 2});
        Assertions.assertEquals(-1, element);
    }

    @Test
    public void given111_return1() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{1, 1, 1});
        Assertions.assertEquals(1, element);
    }

    @Test
    public void given323_return1() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{3, 2, 3});
        Assertions.assertEquals(3, element);
    }

    @Test
    public void given2211122_return2() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{2,2,1,1,1,2,2});
        Assertions.assertEquals(2, element);
    }

    @Test
    public void given3332233322_return3() {
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(new int[]{3,3,3,2,2,3,3,3,2,2});
        Assertions.assertEquals(3, element);
    }
}
