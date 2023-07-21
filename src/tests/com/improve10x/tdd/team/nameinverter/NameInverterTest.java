package com.improve10x.tdd.team.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    NameInverter nameInverter;

    @BeforeEach
    public void setUP(){
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsEmpty(){
        NameInverter nameInverter = new NameInverter();
        String empty = nameInverter.invertName("");
        assertEquals("", empty);
    }

    @Test
    public void givenSingleWord_returnsSingleWord(){
        String singleWord = nameInverter.invertName("vani");
        assertEquals("vani", singleWord);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnsName(){
        String name = nameInverter.invertName("mom  ");
        assertEquals("mom", name);
    }

    @Test
    public void givenSingleWordWithBeginningSpaces_returnsName(){
        String name = nameInverter.invertName("  dad   ");
        assertEquals("dad",name);
    }

    @Test
    public void givenFirstLast_returnsLastFirst(){
       String lastFirst = nameInverter.invertName("first last");
       assertEquals("last, first", lastFirst);
    }
}
