package com.improve10x.tdd.team.nameinverterone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameInverterOneTest {
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("");
        Assertions.assertEquals("", invertedName);
    }
}
