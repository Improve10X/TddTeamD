package com.improve10x.tdd.team.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    NameInverter nameInverter;
    @BeforeEach
    public void setUp(){
        nameInverter = new NameInverter();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsEmpty(){
        String empty = nameInverter.nameInvert("");
        assertEquals("", empty);
    }

    @Test
    public void givenSingleWord_returnsSingleWord(){
        String singleWord = nameInverter.nameInvert("Ammulu");
        assertEquals("Ammulu", singleWord);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnsName(){
        String name = nameInverter.nameInvert("deepthi  ");
        assertEquals("deepthi", name);
    }
}
