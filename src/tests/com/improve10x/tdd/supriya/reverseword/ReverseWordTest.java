package com.improve10x.tdd.supriya.reverseword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Example 1:
//        Input: s=”this is an amazing program”
//        Output: “program amazing an is this”
//
//        Example 2:
//        Input: s=”This is decent”
//        Output: “decent is This”

public class ReverseWordTest {
    ReverseWord reverseWord;

    @BeforeEach
    public void setUp(){
        reverseWord = new ReverseWord();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        String word = reverseWord.find(null);
        assertEquals("", word);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        String word = reverseWord.find("");
        assertEquals("", word);
    }

    @Test
    public void givenPriyaAbhi_returnAbhiPriya(){
        String word = reverseWord.find("priya abhi");
        assertEquals("abhi priya", word);
    }

    @Test
    public void givenGaganKarthik_returnKarthikGagan(){
        String word = reverseWord.find("Gagan Karthik");
        assertEquals("Karthik Gagan", word);
    }

    @Test
    public void givenIDrinkMilk_returnReverse(){
        String word = reverseWord.find("i drink milk");
        assertEquals("milk drink i", word);
    }

    @Test
    public void givenThisisanamazing_program_returnReverse(){
        String word = reverseWord.find("this is an amazing program");
        assertEquals("program amazing an is this", word);
    }
}
