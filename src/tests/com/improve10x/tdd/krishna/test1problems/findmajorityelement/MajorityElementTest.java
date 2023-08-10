package com.improve10x.tdd.krishna.test1problems.findmajorityelement;

import com.improve10x.tdd.krishna.test1problems.MajorityElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    MajorityElement majorityElement;

    @BeforeEach
    public void setup(){
        majorityElement = new MajorityElement();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void given0_returnsMinusOne(){
        int result = majorityElement.findMajorityElement(new int[0]);
        assertEquals(-1, result);
    }

    @Test
    public void given1_returnsOne(){
        int result = majorityElement.findMajorityElement(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void given2_returns2(){
        int result = majorityElement.findMajorityElement(new int[]{2});
        assertEquals(2, result);
    }

    @Test
    public void givenZeroOne_returnsMinusOne(){
        int result = majorityElement.findMajorityElement(new int[]{0, 1});
        assertEquals(-1, result);
    }

    @Test
    public void givenOneOne_returnsOne(){
        int result = majorityElement.findMajorityElement(new int[]{1, 1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwo_returnsTwo(){
        int result = majorityElement.findMajorityElement(new int[]{1, 2});
        assertEquals(2, result);
    }
}
