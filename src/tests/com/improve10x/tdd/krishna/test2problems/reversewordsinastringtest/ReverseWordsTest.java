package com.improve10x.tdd.krishna.test2problems.reversewordsinastringtest;

import com.improve10x.tdd.krishna.test2problems.reversewordsinastring.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        ReverseWords reverseWords = new ReverseWords();
        String reversed = reverseWords.findReverse(null);
        assertEquals("", reversed);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        ReverseWords reverseWords = new ReverseWords();
        String reversed = reverseWords.findReverse("");
        assertEquals("", reversed);
    }
}
