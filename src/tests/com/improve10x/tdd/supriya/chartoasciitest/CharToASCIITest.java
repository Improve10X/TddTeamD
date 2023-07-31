package com.improve10x.tdd.supriya.chartoasciitest;

import com.improve10x.tdd.supriya.chartoascii.CharToASCII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharToASCIITest {
    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        CharToASCII charToASCII = new CharToASCII();
        int giveNull = charToASCII.findValue(null);
        assertEquals(0, giveNull);
    }

    @Test
    public void givenSpace_return32() {
        CharToASCII charToASCII = new CharToASCII();
        int charspace = charToASCII.findValue(' ');
        assertEquals(32, charspace);
    }
}
