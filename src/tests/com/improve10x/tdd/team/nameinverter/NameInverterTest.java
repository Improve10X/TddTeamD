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

    @Test
    public void givenSingleWordWithBeginningSpaces_returnsName(){
        String name = nameInverter.nameInvert("    vasavi     ");
        assertEquals("vasavi", name);
    }

    @Test
    public void givenFirstLast_returnsLastFirst(){
        String lastFirst = nameInverter.nameInvert("first last");
        assertEquals("last, first", lastFirst);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics(){
        String removeHonorifics = nameInverter.nameInvert("miss. karthika devi");
        assertEquals("devi, karthika", removeHonorifics);
    }

    @Test
    public void givenMrHonorifics_removeMrHonorifics(){
        String removeMrHonorifics = nameInverter.nameInvert("mr. pulla reddy");
        assertEquals("reddy, pulla", removeMrHonorifics);
    }

    @Test
    public void givenPostNominal_stayAtEnd(){
        String stayAtEnd = nameInverter.nameInvert("deepu manasa phd.");
        assertEquals("manasa, deepu phd.", stayAtEnd);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd(){
        String stayAtEnd = nameInverter.nameInvert("shanti kala msc. phd.");
        assertEquals("kala, shanti msc. phd.", stayAtEnd);
    }

    @Test
    public void integrationTest(){
        String invertName = nameInverter.nameInvert("mr. bob martins phd.");
        assertEquals("martins, bob phd.", invertName);
    }
}
