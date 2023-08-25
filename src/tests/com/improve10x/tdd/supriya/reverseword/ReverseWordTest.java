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

    @Test
    public void givenEmpty_returnEmpty(){
        ReverseWord reverseWord = new ReverseWord();
        String word = reverseWord.find("");
        Assertions.assertEquals("", word);
    }

    @Test
    public void givenPriyaAbhi_returnAbhiPriya(){
        ReverseWord reverseWord = new ReverseWord();
        String word = reverseWord.find("priya abhi");
        Assertions.assertEquals("abhi priya", word);
    }

    @Test
    public void givenGaganKarthik_returnKarthikGagan(){
        ReverseWord reverseWord = new ReverseWord();
        String word = reverseWord.find("Gagan Karthik");
        Assertions.assertEquals("Karthik Gagan", word);
    }

    @Test
    public void givenIDrinkMilk_returnReverse(){
        ReverseWord reverseWord = new ReverseWord();
        String word = reverseWord.find("i drink milk");
        Assertions.assertEquals("milk drink i", word);
    }
}
