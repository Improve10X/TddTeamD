package com.improve10x.tdd.krishna.practice.encryptiononetest;

import com.improve10x.tdd.krishna.practice.encryptionone.EncryptionOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionOneTest {

    EncryptionOne encryptionone;

    @BeforeEach
    public void setup(){
        encryptionone = new EncryptionOne();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsaca(){
        String value = encryptionone.encrypt(null);
        assertEquals("aca", value);
    }

    @Test
    public void givenEmpty_returnsaca(){
        String empty = encryptionone.encrypt("");
        assertEquals("aca", empty);
    }

    @Test
    public void givenb_returnsbaca(){
        String bValue = encryptionone.encrypt("b");
        assertEquals("baca", bValue);
    }
}
