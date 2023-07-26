package com.improve10x.tdd.supriya.assingmentTest;

import com.improve10x.tdd.supriya.assingment.VowelsAndConsonants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class VowelsAndConsonantsTest {
    @Test
    public void nothing(){}
@Disabled
    @Test
    public void givenEmpty_returnNull(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String  findValue = vowelsAndConsonants.findVowelsOrConsonants("");
        Assertions.assertEquals(null, findValue);
    }
@Disabled
    @Test
    public void givenNull_returnNull(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String  findValue = vowelsAndConsonants.findVowelsOrConsonants(null);
        Assertions.assertEquals(null, findValue);
    }

    @Test
    public void givena_returnsvowels(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String  findValue = vowelsAndConsonants.findVowelsOrConsonants("a");
        Assertions.assertEquals("vowel", findValue);
    }
    @Test
    public void givenb_returnsConsonant(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String findb = vowelsAndConsonants.findVowelsOrConsonants("b");
        Assertions.assertEquals("consonant",findb);
    }

    @Test
    public void givene_returnsVowels(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String finde = vowelsAndConsonants.findVowelsOrConsonants("e");
        Assertions.assertEquals("vowel", finde);
    }

    @Test
    public void giveni_returnsVowels(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String finde = vowelsAndConsonants.findVowelsOrConsonants("i");
        Assertions.assertEquals("vowel", finde);
    }

    @Test
    public void given0_returnsVowels(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String finde = vowelsAndConsonants.findVowelsOrConsonants("o");
        Assertions.assertEquals("vowel", finde);
    }

    @Test
    public void givenu_returnsVowels(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String finde = vowelsAndConsonants.findVowelsOrConsonants("u");
        Assertions.assertEquals("vowel", finde);
    }
    @Test
    public void givend_returnsConsonant(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String findd = vowelsAndConsonants.findVowelsOrConsonants("d");
        Assertions.assertEquals("consonant", findd);
    }

    @Test
    public void givenz_returnsConsonant(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String findz = vowelsAndConsonants.findVowelsOrConsonants("z");
        Assertions.assertEquals("consonant", findz);
    }
}
