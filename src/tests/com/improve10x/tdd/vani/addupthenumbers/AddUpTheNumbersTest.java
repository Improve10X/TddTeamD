package com.improve10x.tdd.vani.addupthenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUpTheNumbersTest {
    @Test
    public void nothing(){}

    @Test
    public void givenNumber_returnsNumber(){
        AddUpTheNumbers addUpTheNumbers = new AddUpTheNumbers();
        int number = addUpTheNumbers.addUp(4);
        assertEquals(10,number);
    }

    @Test
    public void givenNumbers_returnsNumbers(){
        AddUpTheNumbers addUpTheNumbers = new AddUpTheNumbers();
        int number = addUpTheNumbers.addUp(13);
        assertEquals(91,number);
    }

    @Test
    public void givenNumber_returnsNumbers(){
        AddUpTheNumbers addUpTheNumbers = new AddUpTheNumbers();
        int number = addUpTheNumbers.addUp(600);
        assertEquals(180300,number);
    }
}
