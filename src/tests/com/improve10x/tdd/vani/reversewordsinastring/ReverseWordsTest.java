package com.improve10x.tdd.vani.reversewordsinastring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Reverse Words in a String
//        Problem Statement: Given a string s, reverse the words of the string.
//        Example 1:
//        Input: s=”this is an amazing program”
//        Output: “program amazing an is this”
//        Example 2:
//        Input: s=”This is decent”
//        Output: “decent is This”

public class ReverseWordsTest {
    ReverseWords reverseWords;

    @BeforeEach
    public void setUp(){
        reverseWords = new ReverseWords();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsEmpty(){
        String sentence = reverseWords.find(null);
        assertEquals("",sentence);
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        String sentence = reverseWords.find("");
        assertEquals("",sentence);
    }
    @Test
    public void givenA_returnsA(){
        String sentence = reverseWords.find("A");
        assertEquals("A",sentence);
    }
    @Test
    public void givenAB_returnsBA(){
        String sentence = reverseWords.find("AB");
        assertEquals("BA",sentence);
    }
    @Test
    public void givenAND_returnsDNA(){
        String sentence = reverseWords.find("AND");
        assertEquals("DNA",sentence);
    }
}
