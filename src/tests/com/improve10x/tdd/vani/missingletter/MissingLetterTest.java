package com.improve10x.tdd.vani.missingletter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Find the Missing Letter
//        Create a function that takes an array of increasing letters and return the missing letter.
//        Examples
//        missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"
//        missingLetter(["O", "Q", "R", "S"]) ➞ "P"
//        missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"
//        missingLetter(["m", "o"]) ➞ "n"

public class MissingLetterTest {
    MissingLetter missingLetter;
    @BeforeEach
    public void setUp(){
        missingLetter = new MissingLetter();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmpty(){
        String empty = missingLetter.findMissingLetter(null);
        assertEquals("", empty);
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        String empty = missingLetter.findMissingLetter(new String[]{""});
        assertEquals("", empty);
    }
    @Test
    public void givenAAndC_returnsB(){
        String b = missingLetter.findMissingLetter(new String[]{"A","C"});
        assertEquals("B", b);
    }
}
