package com.improve10x.tdd.krishna.nameinvertertest;

import com.improve10x.tdd.krishna.nameinverter.NameInverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    NameInverter nameInverter;

    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenEmpty_returnEmpty(){
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenSingleWord_returnSingleWord(){
        String invertedName = nameInverter.invertName("krishna");
        assertEquals("krishna", invertedName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord(){
        String invertedName = nameInverter.invertName("krishna  ");
        assertEquals("krishna", invertedName);
    }

    @Test
    public void givenSingleWordWithBeginning_returnSingleWord(){
        String invertedName = nameInverter.invertName("  krishna  ");
        assertEquals("krishna", invertedName);
    }

    @Test
    public void givenFirstLast_returnsInvertedName(){
        String invertedName = nameInverter.invertName("Gangimeni Krishna");
        assertEquals("Krishna, Gangimeni", invertedName);

    }

    @Test
    public void givenHonorifics_ignoringHonorifics(){
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoringHonorifics(){
        String invertedName = nameInverter.invertName("Mr. Gangimeni Krishna");
        assertEquals("Krishna, Gangimeni", invertedName);
    }

    @Test
    public void givenPostNominals_stayAtEnd(){
        String invertedName = nameInverter.invertName(("Gangimeni Krishna MSc."));
        assertEquals("Krishna, Gangimeni MSc.", invertedName);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd(){
        String invertedName = nameInverter.invertName("Gangimeni Krishna MSc. PhD.");
        assertEquals("Krishna, Gangimeni MSc. PhD.", invertedName);
    }

    @Test
    public void integrationTest(){
        String invertedName = nameInverter.invertName("Mr. Bob Martins MTech. PhD.");
        assertEquals("Martins, Bob MTech. PhD." , invertedName);
    }
}
