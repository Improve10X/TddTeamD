package com.improve10x.tdd.team.nameinverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsEmpty(){
        NameInverter nameInverter = new NameInverter();
        String empty = nameInverter.nameInvert("");
        assertEquals("", empty);
    }

}
