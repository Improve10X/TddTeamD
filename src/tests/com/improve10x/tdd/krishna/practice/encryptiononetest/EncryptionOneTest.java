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

    @Test
    public void givenbc_returnscbaca(){
        String bcValue = encryptionone.encrypt("bc");
        assertEquals("cbaca", bcValue);
    }

    @Test
    public void givenac_returnsc0aca(){
        String acValue = encryptionone.encrypt("ac");
        assertEquals("c0aca", acValue);
    }

    @Test
    public void givened_returnsd1aca(){
        String edValue = encryptionone.encrypt("ed");
        assertEquals("d1aca", edValue);
    }

    @Test
    public void givenif_returnsf2aca(){
        String ifValue = encryptionone.encrypt("if");
        assertEquals("f2aca", ifValue);
    }

    @Test
    public void givenog_returnsg3aca(){
        String ogValue = encryptionone.encrypt("og");
        assertEquals("g3aca", ogValue);
    }

    @Test
    public void givenuh_returnsh4aca(){
        String uhValue = encryptionone.encrypt("uh");
        assertEquals("h4aca", uhValue);
    }

    @Test
    public void givenae_returns10aca(){
        String aeValue = encryptionone.encrypt("ae");
        assertEquals("10aca", aeValue);
    }

    @Test
    public void givenone_returns1n3aca(){
        String oneValue = encryptionone.encrypt("one");
        assertEquals("1n3aca", oneValue);
    }

    @Test
    public void givenapple_returns1lpp0aca(){
        String apple = encryptionone.encrypt("apple");
        assertEquals("1lpp0aca", apple);
    }

    @Test
    public void givenB_returnsbaca(){
        String bValue = encryptionone.encrypt("B");
        assertEquals("baca", bValue);
    }
}
