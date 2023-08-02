package com.improve10x.tdd.supriya.practice.missinglettertest;

import com.improve10x.tdd.supriya.findthemissingletter.MissingLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//Find the Missing Letter
//        Create a function that takes an array of increasing letters and return the missing letter.
//        Examples
//        missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"
//        missingLetter(["O", "Q", "R", "S"]) ➞ "P"
//        missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"
//        missingLetter(["m", "o"]) ➞ "n"

public class MissingLetterTest {

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty(){
        MissingLetter missingLetter = new MissingLetter();
        String letter =missingLetter.findMissingLetter(new String[]{""});
        Assertions.assertEquals("", letter);
    }

    @Test
    public void givenNull_returnEmpty(){
        MissingLetter missingLetter = new MissingLetter();
        String letter =missingLetter.findMissingLetter(new String[]{""});
        Assertions.assertEquals("", letter);
    }

    @Test
    public void givenac_returnb(){
        MissingLetter missingLetter = new MissingLetter();
        String letter =missingLetter.findMissingLetter(new String[]{"a", "c"});
        Assertions.assertEquals("b", letter);
    }



}
