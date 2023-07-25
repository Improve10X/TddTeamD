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

    @Test
    public void givena_returns0aca(){
        String aValue = encryptionone.encrypt("a");
        assertEquals("0aca", aValue);
    }

    @Test
    public void givene_returns1aca(){
        String eValue = encryptionone.encrypt("e");
        assertEquals("1aca", eValue);
    }

    @Test
    public void giveni_returns2aca(){
        String iValue = encryptionone.encrypt("i");
        assertEquals("2aca", iValue);
    }

    @Test
    public void giveno_returns3aca(){
        String oValue = encryptionone.encrypt("o");
        assertEquals("3aca", oValue);
    }

    @Test
    public void givenu_returns4aca(){
        String uValue = encryptionone.encrypt("u");
        assertEquals("4aca", uValue);
    }
}
