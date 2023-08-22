package com.improve10x.tdd.vani.reversewordsinastring;

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
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsEmpty(){
        ReverseWords reverseWords = new ReverseWords();
        String sentence = reverseWords.find(null);
        assertEquals("",sentence);
    }
}
