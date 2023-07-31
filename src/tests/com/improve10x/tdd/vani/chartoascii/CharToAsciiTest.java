package com.improve10x.tdd.vani.chartoascii;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Char-to-ASCII
//        Create a function that returns the ASCII value of the passed in character.
//        Examples
//        ctoa('A') ➞ 65
//        ctoa('m') ➞ 109
//        ctoa('[') ➞ 91
//        ctoa('\') ➞ 92

public class CharToAsciiTest {
    CharToAscii charToAscii;
    @BeforeEach
    public void setUp(){
        charToAscii = new CharToAscii();
    }
    @Test
    public void nothing(){}
//    @Disabled
//    @Test
//    public void givenSpace_returns32(){
//        int number = charToAscii.ctoa("SPACE");
//        assertEquals(32,number);
//    }
//    @Disabled
//    @Test
//    public void givenA_returns65(){
//        int number = charToAscii.ctoa("A");
//        assertEquals(65,number);
//    }
//    @Disabled
//    @Test
//    public void givenB_returns66(){
//        int number = charToAscii.ctoa("B");
//        assertEquals(66,number);
//    }
//    @Disabled
//    @Test
//    public void givenC_returns67(){
//        int number = charToAscii.ctoa("C");
//        assertEquals(67,number);
//    }
//    @Disabled
//    @Test
//    public void givenBrace_returns91(){
//        int number = charToAscii.ctoa("[");
//        assertEquals(91,number);
//    }
//    @Disabled
//    @Test
//    public void givenSlash_returns92(){
//        int number = charToAscii.ctoa("\u0000");
//        assertEquals(92,number);
//    }
    @Test
    public void givenNull_returns0(){
        int number = charToAscii.ctoa(null);
        assertEquals(0,number);

    }
    @Test
    public void givenSpace_returns32(){
        int number = charToAscii.ctoa(' ');
        assertEquals(32, number);
    }
//    @Test
//    public void givenA_return65(){
//        int number = charToAscii.ctoa('A');
//        assertEquals(65,number);
//    }
}
