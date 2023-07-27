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
    public void givenabc_returnSpaces(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("a b c");
        Assertions.assertEquals(2, countSpace);
    }

    @Test
    public void givenName_returnZero(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("Supriya");
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenimproveTenx_returnZero(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("improve 10x");
        Assertions.assertEquals(1, countSpace);
    }

    @Test
    public void givenNameWithSpace_returnOne(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("S Supriya");
        Assertions.assertEquals(1,countSpace);
    }

    @Test
    public void givenNameWithSpaces_returnTwo(){
        CountSpaces countSpaces = new CountSpaces();
        int countSpace = countSpaces.findSpaces("S Supriya Singamsetty");
        Assertions.assertEquals(2,countSpace);
    }
}
