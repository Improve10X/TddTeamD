package com.improve10x.tdd.vani.practise.encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//The Karaca's Encryption Algorithm
//        Make a function that encrypts a given input with these steps:
//        Input: "apple"
//        Step 1: Reverse the input: "elppa"
//        Step 2: Replace all vowels using the following chart:
//        a => 0
//        e => 1
//        i => 2
//        o => 3
//        u => 4
//// "1lpp0"
//        Step 3: Add "aca" to the end of the word: "1lpp0aca"
//        Output: "1lpp0aca"
//        Examples
//        encrypt("banana") ➞ "0n0n0baca"
//        encrypt("karaca") ➞ "0c0r0kaca"
//        encrypt("burak") ➞ "k0r4baca"
//        encrypt("alpaca") ➞ "0c0pl0aca"

public class EncryptionTest {
    Encryption encryption;

    @BeforeEach
    public void setUp(){
        encryption = new Encryption();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsAca(){
        String aca = encryption.encrypt(null);
        assertEquals("aca", aca);
    }

    @Test
    public void givenEmpty_returnsAca(){
        String aca = encryption.encrypt("");
        assertEquals("aca", aca);
    }

    @Test
    public void givenB_returnsBAca(){
        String bAca = encryption.encrypt("b");
        assertEquals("baca", bAca);
    }

    @Test
    public void givenA_returns0Aca(){
        String zeroAca = encryption.encrypt("a");
        assertEquals("0aca",zeroAca);
    }

    @Test
    public void givenE_returns1aca(){
        String oneAca = encryption.encrypt("e");
        assertEquals("1aca", oneAca);
    }

    @Test
    public void givenI_returns2Aca(){
        String twoAca = encryption.encrypt("i");
        assertEquals("2aca", twoAca);
    }

    @Test
    public void givenO_returns3aca(){
        String threeAca = encryption.encrypt("o");
        assertEquals("3aca", threeAca);
    }

    @Test
    public void givenU_returns4aca(){
        String fourAca = encryption.encrypt("u");
        assertEquals("4aca", fourAca);
    }

    @Test
    public void givenBc_returnsCbAca(){
        String cbAca = encryption.encrypt("bc");
        assertEquals("cbaca", cbAca);
    }

    @Test
    public void givenAc_returnsC0Aca(){
        String c0Aca = encryption.encrypt("ac");
        assertEquals("c0aca", c0Aca);
    }

    @Test
    public void givenEd_returnsD1aca(){
        String d1Aca = encryption.encrypt("ed");
        assertEquals("d1aca", d1Aca);
    }

    @Test
    public void givenIf_returnsF2aca(){
        String f2Aca = encryption.encrypt("if");
        assertEquals("f2aca", f2Aca);
    }

    @Test
    public void givenOg_returnsg3aca(){
        String g3Aca = encryption.encrypt("og");
        assertEquals("g3aca", g3Aca);
    }

}
