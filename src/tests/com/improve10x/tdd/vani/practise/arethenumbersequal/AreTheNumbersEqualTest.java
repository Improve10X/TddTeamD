package com.improve10x.tdd.vani.practise.arethenumbersequal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Are the Numbers Equal?
//        Create a function that returns true when x is equal to y; otherwise return false.
//        Examples
//        isSameNum(4, 8) ➞ false
//        isSameNum(2, 2) ➞  true
//        isSameNum(42, 32) ➞  false

public class AreTheNumbersEqualTest {
    @Test
    public void nothing(){}

    @Test
    public void givenZeros_returnsTrue(){
        AreTheNumbersEqual areTheNumbersEqual = new AreTheNumbersEqual();
        boolean statement = areTheNumbersEqual.isSameNumber(0,0);
        assertEquals(true, statement);
    }
}
