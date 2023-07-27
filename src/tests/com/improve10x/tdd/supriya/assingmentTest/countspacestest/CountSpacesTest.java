package com.improve10x.tdd.supriya.assingmentTest.countspacestest;

import com.improve10x.tdd.supriya.assingment.countSpaces.CountSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSpacesTest {
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("");
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenNull_returnZero(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces(null);
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenName_returnZero(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("Supriya");
        Assertions.assertEquals(0, countSpace);
    }
}
