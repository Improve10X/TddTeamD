package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharToASCIITest {

    ChartToASCII chartToASCII;

    @BeforeEach
    public void setup(){
        chartToASCII = new ChartToASCII();
    }

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
        int result = chartToASCII.findASCIIValue(null);
        assertEquals(0, result);
    }

    @Test
    public void givenSpace_return32(){
        int result = chartToASCII.findASCIIValue(' ');
        assertEquals(32, result);
    }

    @Test
    public void givenA_return65(){
        int result = chartToASCII.findASCIIValue('A');
        assertEquals(65, result);
    }

    @Test
    public void givenB_return66(){
        int result = chartToASCII.findASCIIValue('B');
        assertEquals(66, result);
    }

    @Test
    public void givenZ_return90(){
        int result = chartToASCII.findASCIIValue('Z');
        assertEquals(90, result);
    }

    @Test
    public void given7_return55(){
        int result = chartToASCII.findASCIIValue('7');
        assertEquals(55, result);
    }

    @Test
    public void givenl_return108(){
        int result = chartToASCII.findASCIIValue('l');
        assertEquals(108, result);
    }

    @Test
    public void integrationTest(){
        int result = chartToASCII.findASCIIValue('m');
        assertEquals(109, result);
        int result1 = chartToASCII.findASCIIValue('[');
        assertEquals(91, result1);
        int result2 = chartToASCII.findASCIIValue('\\');
        assertEquals(92, result2);
    }
}
