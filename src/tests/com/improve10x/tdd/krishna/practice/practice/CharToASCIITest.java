package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharToASCIITest {

    @Test
    public void nothing(){
    }
///Char-to-ASCII
////        Create a function that returns the ASCII value of the passed in character.
////        Examples
////        ctoa('A') ➞ 65
////        ctoa('m') ➞ 109
////        ctoa('[') ➞ 91
////        ctoa('\') ➞ 92
    @Test
    public void givenNull_returnZero(){
        ChartToASCII chartToASCII = new ChartToASCII();
        int result = chartToASCII.findASCIIValue(null);
        assertEquals(0, result);
    }
}
