package com.improve10x.tdd.supriya.practice.encryptionalgorithemtest;

import com.improve10x.tdd.supriya.practice.encryptionalgorithem.EncryptionAlgorithm;
import org.junit.jupiter.api.Assertions;
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
//        o => 2
//        u => 3
//// "1lpp0"
//        Step 3: Add "aca" to the end of the word: "1lpp0aca"
//        Output: "1lpp0aca"
//        Examples
//        encrypt("banana") ➞ "0n0n0baca"
//        encrypt("karaca") ➞ "0c0r0kaca"
//        encrypt("burak") ➞ "k0r3baca"
//        encrypt("alpaca") ➞ "0c0pl0aca"
public class EncryptionAlgorithmTest {
    EncryptionAlgorithm encryptionAlgorithm;
    @BeforeEach
    public void setUp() {
        encryptionAlgorithm = new EncryptionAlgorithm();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsaca(){
        String  value = encryptionAlgorithm.findEncrypt(null);
        assertEquals("aca", value);
    }

    @Test
    public void givenEmpty_returnsaca(){
        String value = encryptionAlgorithm.findEncrypt("");
        assertEquals("aca", value);
    }

    @Test
    public void givenb_returnsbaca(){
        String bValue = encryptionAlgorithm.findEncrypt("b");
        assertEquals("baca", bValue);
    }

    @Test
    public void givena_returns0aca(){
        String aValue = encryptionAlgorithm.findEncrypt("a");
        assertEquals("0aca", aValue);
    }

    @Test
    public void givene_returns1aca(){
        String eValue = encryptionAlgorithm.findEncrypt("e");
        assertEquals("1aca", eValue);
    }

    @Test
    public void giveni_returns2aca(){
        String aValue = encryptionAlgorithm.findEncrypt("i");
        assertEquals("2aca", aValue);
    }

    @Test
    public void giveno_returns3aca(){
        String aValue = encryptionAlgorithm.findEncrypt("o");
        assertEquals("3aca", aValue);
    }

    @Test
    public void givenu_returns4aca(){
        String aValue = encryptionAlgorithm.findEncrypt("u");
        assertEquals("4aca", aValue);
    }

    @Test
    public void givebc_returnscbaca(){
        String aValue = encryptionAlgorithm.findEncrypt("bc");
        assertEquals("cbaca", aValue);
    }

    @Test
    public void giveac_returnc0aca(){
        String aValue = encryptionAlgorithm.findEncrypt("ac");
        assertEquals("c0aca", aValue);
    }

    @Test
    public void giveed_returnsd1aca(){
        String aValue = encryptionAlgorithm.findEncrypt("ed");
        assertEquals("d1aca", aValue);
    }

    @Test
    public void giveif_returnsf2aca(){
        String aValue = encryptionAlgorithm.findEncrypt("if");
        assertEquals("f2aca", aValue);
    }

    @Test
    public void giveog_returnsg3aca(){
        String aValue = encryptionAlgorithm.findEncrypt("og");
        assertEquals("g3aca", aValue);
    }

    @Test
    public void giveuh_returnsh4aca(){
        String aValue = encryptionAlgorithm.findEncrypt("uh");
        assertEquals("h4aca", aValue);
    }

    @Test
    public void giveae_returns10aca(){
        String aValue = encryptionAlgorithm.findEncrypt("ae");
        assertEquals("10aca", aValue);
    }

    @Test
    public void givenone_returns1n3aca(){
        String aValue = encryptionAlgorithm.findEncrypt("one");
        assertEquals("1n3aca", aValue);
    }

    @Test
    public void givenapple_returns1lpp0aca(){
        String aValue = encryptionAlgorithm.findEncrypt("apple");
        assertEquals("1lpp0aca", aValue);
    }
    }

