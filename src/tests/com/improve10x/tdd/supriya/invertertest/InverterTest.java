package com.improve10x.tdd.supriya.invertertest;

import com.improve10x.tdd.supriya.inverter.InverterName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InverterTest {
    InverterName nameInverter;

    @BeforeEach
    public void setUp() {
        nameInverter = new InverterName();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenEmpty_returnsEmpty() {
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    //
    @Test
    public void givenSingleName_returnSingleName() {
        String invertedName = nameInverter.invertName("name");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleNameWithTraillingSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("name  ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleNameWithBeginningSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("  name  ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenFirstLast_returnsInvertedName() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givePostNominals_stayAtEnd() {
        String invertedName = nameInverter.invertName("first last Msc.");
        assertEquals("last, first Msc.", invertedName);
    }

    @Test
    public void giveMultiPostNominals_stayAtEnd() {
        String invertedName = nameInverter.invertName("first last Msc. PhD.");
        assertEquals("last, first Msc. PhD.", invertedName);
    }
}
