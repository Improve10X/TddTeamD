package com.improve10x.tdd.supriya.chartoasciitest;

import com.improve10x.tdd.supriya.chartoascii.CharToASCII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharToASCIITest {
    CharToASCII charToASCII;
    @BeforeEach
    public void setUp(){
        charToASCII = new CharToASCII();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        int giveNull = charToASCII.findValue(null);
        assertEquals(0, giveNull);
    }

    @Test
    public void givenSpace_return32() {
        int charspace = charToASCII.findValue(' ');
        assertEquals(32, charspace);
    }

    @Test
    public void givenA_return65() {
        int charA = charToASCII.findValue( 'A');
        assertEquals(65, charA);
    }

    @Test
    public void givenB_return66(){
        int charB = charToASCII.findValue('B');
        assertEquals(66,charB);
    }

    @Test
    public void givenX_return88(){
        int charX = charToASCII.findValue('X');
        assertEquals(88,charX);
    }

    @Test
    public void givenm_return109(){
        int charm = charToASCII.findValue('m');
        assertEquals(109,charm);
    }

    @Test
    public void givenBracket_return91(){
        int charbracket = charToASCII.findValue('[');
        assertEquals(91,charbracket);
    }

    @Test
    public void givenSlash_return91(){
        int charSlash = charToASCII.findValue('\\');
        assertEquals(92,charSlash);
    }

    @Test
    public void givenIntegrations_returnsIntegrations(){
        int charop = charToASCII.findValue('@');
        assertEquals(64,charop);
        int charbrace = charToASCII.findValue('}');
        assertEquals(125,charbrace);
        int charopeanBrace = charToASCII.findValue('{');
        assertEquals(123,charopeanBrace);
    }
}
