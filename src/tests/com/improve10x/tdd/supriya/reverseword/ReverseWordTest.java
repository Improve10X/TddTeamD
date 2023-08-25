package com.improve10x.tdd.supriya.reverseword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        ReverseWord reverseWord = new ReverseWord();
        String word = reverseWord.find(null);
        Assertions.assertEquals("", word);
    }
}
