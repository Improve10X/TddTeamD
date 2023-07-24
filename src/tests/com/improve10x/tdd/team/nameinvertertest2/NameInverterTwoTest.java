package com.improve10x.tdd.team.nameinvertertest2;
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
    @Test
    public void givenSingleWord_returnsSingleWord(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("Surya");
        assertEquals("Surya", invertedName);
    }
    @Test
    public void givenSingleWordWithTrailingSpaces_returnsSingleWord(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("Surya  ");
        assertEquals("Surya", invertedName);
    }
    @Test
    public void givenSingleWordWithBeginningSpaces_returnsSingleWord(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName(" Surya  ");
        assertEquals("Surya", invertedName);
    }
    @Test
    public void givenFirstLast_returnsInvertedName(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("SivaKumar Surya");
        assertEquals("Surya, SivaKumar", invertedName);
    }
    @Test
    public void givenHonorifics_ignoreHonorifics(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("Mrs. SivaKumar Surya");
        assertEquals("Surya, SivaKumar", invertedName);
    }
    @Test
    public void givenHonorifics_stayAtEnd(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("SivaKumar Surya MSc.");
        assertEquals("Surya, SivaKumar MSc.", invertedName);
    }
    @Test
    public void givenPostNominals_stayAtEnd(){
        NameInverterTwo nameInverterTwo = new NameInverterTwo();
        String invertedName = nameInverterTwo.invertName("SivaKumar Surya MSc. PhD.");
        assertEquals("Surya, SivaKumar MSc. PhD.", invertedName);
    }
}
