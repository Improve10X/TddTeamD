package com.improve10x.tdd.krishna.practice.eulersphitest;

import com.improve10x.tdd.krishna.practice.eulersphi.EulersPhi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulersPhiTest {

    EulersPhi eulersPhi;
    @BeforeEach
    public void setup(){
        eulersPhi = new EulersPhi();
    }
    @Test
    public void nothing(){
    }
    @Test
    public void givenZero_returnsZero(){
        int divisors = eulersPhi.findDivisors(0);
        assertEquals(0, divisors);
    }
    @Test
    public void givenOne_returnsOne(){
        int divisors = eulersPhi.findDivisors(1);
        assertEquals(1, divisors);
    }
    @Test
    public void givenTwo_returnsOneTwo(){
        int divisors = eulersPhi.findDivisors(2);
        assertEquals(2, divisors);
    }
}
