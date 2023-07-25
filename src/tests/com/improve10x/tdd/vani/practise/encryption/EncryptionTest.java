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
        String aca = encryption.encrypt("null");
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

}
