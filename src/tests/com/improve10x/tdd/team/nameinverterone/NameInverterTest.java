package com.improve10x.tdd.team.nameinverterone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenEmpty_returnsEmpty(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("");
        assertEquals("", invertedName);

    }

    @Test
    public void givenName_returnsName(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("name");
        assertEquals("name", invertedName);
    }
    @Test
    public void givenNameWithTraillingSpaces_returnsName(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("name   ");
        assertEquals("name",invertedName);
    }
}
