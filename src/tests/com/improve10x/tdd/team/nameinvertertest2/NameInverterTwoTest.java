package com.improve10x.tdd.team.nameinvertertest2;

import com.improve10x.tdd.team.nameinverter.NameInverter;
import com.improve10x.tdd.team.nameinverter2.NameInverterTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTwoTest {

    @Test
    public void nothing(){
    }
    @Test
    public void givenEmpty_returnsEmpty(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("");
        assertEquals("", invertedName);
    }
}
