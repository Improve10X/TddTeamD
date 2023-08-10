package com.improve10x.tdd.krishna.test1problems.findmajorityelement;

import com.improve10x.tdd.krishna.test1problems.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    public void nothing(){
    }

    @Test
    public void given0_returnsMinusOne(){
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.findMajorityElement(new int[0]);
        assertEquals(-1, result);
    }

    @Test
    public void given1_returnsOne(){
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.findMajorityElement(new int[]{1});
        assertEquals(1, result);
    }
}
