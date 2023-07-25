package com.improve10x.tdd.krishna.practice.encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {

    Encryption encryption;

    @BeforeEach
    public void setup(){
        encryption = new Encryption();
    }

    @Test
    public void nothing(){
    }

//The Karaca's Encryption Algorithm
//Make a function that encrypts a given input with these steps:
//Input: "apple"
//Step 1: Reverse the input: "elppa"
//Step 2: Replace all vowels using the following chart:
//a => 0
//e => 1
//i => 2
//o => 3
//u => 4
//// "1lpp0"
//Step 3: Add "aca" to the end of the word: "1lpp0aca"
//Output: "1lpp0aca"
//Examples
//encrypt("banana") ➞ "0n0n0baca"
//encrypt("karaca") ➞ "0c0r0kaca"
//encrypt("burak") ➞ "k0r3baca"
//encrypt("alpaca") ➞ "0c0pl0aca"

    @Test
    public void givenNull_returnsaca(){
        String result = encryption.encrypt(null);
        assertEquals("aca", result);
    }

    @Test
    public void givenEmpty_returnsaca(){
        String result = encryption.encrypt("");
        assertEquals("aca", result);
    }

    @Test
    public void givenb_returnsbaca(){
        String bValue = encryption.encrypt("b");
        assertEquals("baca", bValue);
    }

    @Test
    public void givena_returns0aca(){
        String aValue = encryption.encrypt("a");
        assertEquals("0aca", aValue);
    }

    @Test
    public void givene_returns1aca(){
        String eValue = encryption.encrypt("e");
        assertEquals("1aca", eValue);
    }

    @Test
    public void giveni_returns2aca(){
        String iValue = encryption.encrypt("i");
        assertEquals("2aca", iValue);
    }

    @Test
    public void giveno_returns3aca(){
        String oValue = encryption.encrypt("o");
        assertEquals("3aca", oValue);
    }

    @Test
    public void givenu_returns4aca(){
        String uValue = encryption.encrypt("u");
        assertEquals("4aca", uValue);
    }

    @Test
    public void givenbc_returnscbaca(){
        String bcValue = encryption.encrypt("bc");
        assertEquals("cbaca", bcValue);
    }

    @Test
    public void givenac_returnsc0aca(){
        String acValue = encryption.encrypt("ac");
        assertEquals("c0aca", acValue);
    }

    @Test
    public void givened_returnsd1aca(){
        String edValue = encryption.encrypt("ed");
        assertEquals("d1aca", edValue);
    }

    @Test
    public void givenif_returnsf2aca(){
        String ifValue = encryption.encrypt("if");
        assertEquals("f2aca", ifValue);
    }

    @Test
    public void givenog_returnsg3aca(){
        String ogValue = encryption.encrypt("og");
        assertEquals("g3aca", ogValue);
    }

    @Test
    public void givenuh_returnsh4aca(){
        String uhValue = encryption.encrypt("uh");
        assertEquals("h4aca", uhValue);
    }
}
