package com.improve10x.tdd.supriya.assingmentTest;

import com.improve10x.tdd.supriya.assingment.VowelsAndConsonants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelsAndConsonantsTest {
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnNull(){
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
        String  findValue = vowelsAndConsonants.findVowelsOrConsonants("");
        Assertions.assertEquals(null, findValue);
    }

//    @Test
//    public void givena_returnsvowels(){
//        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
//        String  findValue = vowelsAndConsonants.findVowelsOrConsonants("a");
//        Assertions.assertEquals("vowel", findValue);
//    }
//
//    @Test
//    public void givenb_returnsConsonant(){
//        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
//        String findb = vowelsAndConsonants.findVowelsOrConsonants("b");
//        Assertions.assertEquals("consonant",findb);
//    }
//
//    @Test
//    public void givene_returnsVowels(){
//        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
//        String finde = vowelsAndConsonants.findVowelsOrConsonants("e");
//        Assertions.assertEquals("vowel", finde);
//    }

}
