package com.improve10x.tdd.supriya.assingmentTest.countspacestest;

import com.improve10x.tdd.supriya.assingment.countSpaces.CountSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountSpacesTest {
    CountSpaces countSpaces;
    @BeforeEach
    public void setUp(){
        countSpaces = new CountSpaces();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty(){
        int countSpace = countSpaces.findSpaces("");
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenNull_returnZero(){
        int countSpace = countSpaces.findSpaces(null);
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenabc_returnSpaces(){
        int countSpace = countSpaces.findSpaces("a b c");
        Assertions.assertEquals(2, countSpace);
    }

    @Test
    public void givenName_returnZero(){
        int countSpace = countSpaces.findSpaces("Supriya");
        Assertions.assertEquals(0, countSpace);
    }

    @Test
    public void givenimproveTenx_returnZero(){
        int countSpace = countSpaces.findSpaces("improve 10x");
        Assertions.assertEquals(1, countSpace);
    }

    @Test
    public void givenNameWithSpace_returnOne(){
        int countSpace = countSpaces.findSpaces("S Supriya");
        Assertions.assertEquals(1,countSpace);
    }

    @Test
    public void givenNameWithSpaces_returnTwo(){
        int countSpace = countSpaces.findSpaces("S Supriya Singamsetty");
        Assertions.assertEquals(2,countSpace);
    }

    @Test
    public void givenaeropl_returnSpace(){
        int countSpace = countSpaces.findSpaces("a e r p l");
        Assertions.assertEquals(4,countSpace);
    }
}
