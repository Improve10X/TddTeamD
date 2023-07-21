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
    @Test
    public void givenNameWithBeginning_returnsName(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("  Name  ");
        assertEquals("Name", invertedName);
    }
    @Test
    public void givenFirstLast_returnsInvertedName(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("first last");
        assertEquals("last, first", invertedName);
    }
    @Test
    public void givenHonorifics_ignoreHonorifics(){
        NameInverterOne nameInverterOne = new NameInverterOne();
        String invertedName = nameInverterOne.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }
}
