package com.improve10x.tdd.vani.nameinverter;

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

    //    input = ""  output = ""
    @Test
    public void givenEmpty_returnsEmpty(){
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    //    input = "name" output = "name"
    @Test
    public void givenName_returnsName(){
        String invertedName = nameInverter.invertName("vani");
        assertEquals("vani",invertedName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnsSingleWord(){
        String invertedName = nameInverter.invertName("name  ");
        assertEquals("name",invertedName);
    }

    @Test
    public void givenSingleWordWithBeginningSpaces_returnsSingleWord(){
        String invertedName = nameInverter.invertName("    name   ");
        assertEquals("name",invertedName);
    }

    @Test
    public void givenFirstLast_returnsLastFirst(){
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics(){
        String invertedName = nameInverter.invertName("mrs. first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics(){
        String invertedName = nameInverter.invertName("mr. first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenPostNominals_stayAtEnd(){
        String invertedName = nameInverter.invertName("sree vani phd.");
        assertEquals("vani, sree phd.",invertedName);
    }

    @Test
    public void givenMultiPostNominal_stayAtEnd(){
        String invertedName = nameInverter.invertName("sree vani phd. msc.");
        assertEquals("vani, sree phd. msc.", invertedName);
    }

    @Test
    public void integrationTest(){
        String invertedName = nameInverter.invertName("mr. bob martins msc. phd.");
        assertEquals("martins, bob msc. phd.", invertedName);
    }
}
