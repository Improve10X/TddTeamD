package com.improve10x.tdd.krishna.practice.encryption;

import org.junit.jupiter.api.BeforeEach;
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
//o => 2
//u => 34
//// "1lpp0"
//Step 3: Add "aca" to the end of the word: "1lpp0aca"
//Output: "1lpp0aca"
//Examples
//encrypt("banana") ➞ "0n0n0baca"
//encrypt("karaca") ➞ "0c0r0kaca"
//encrypt("burak") ➞ "k0r3baca"
//encrypt("alpaca") ➞ "0c0pl0aca"

    @Test
    public void givenEmpty_returnsZero(){
        String result = encryption.findEncryption("");
        assertEquals("0", result);
    }

    @Test
    public void givena_returnsZero(){
        String aValue = encryption.findEncryption("a");
        assertEquals("0", aValue);
    }

    @Test
    public void givenb_returnsb(){
        String bValue = encryption.findEncryption("b");
        assertEquals("b", bValue);
    }
}
