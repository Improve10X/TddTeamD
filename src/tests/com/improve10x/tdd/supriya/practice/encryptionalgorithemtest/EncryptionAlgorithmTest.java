package com.improve10x.tdd.supriya.practice.encryptionalgorithemtest;

import com.improve10x.tdd.supriya.practice.encryptionalgorithem.EncryptionAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    @Test
    public void nothing(){}
    
    @Test
    public void givenEmpty_returnZero(){
        EncryptionAlgorithm encryptionAlgorithm = new EncryptionAlgorithm();
        String zero = encryptionAlgorithm.findEncryption("");
        Assertions.assertEquals("0", zero);
    }
}
