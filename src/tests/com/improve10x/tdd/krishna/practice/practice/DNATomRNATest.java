package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNATomRNATest {

    DNATomRNA dnaTomRNA;

    @BeforeEach
    public void setup(){
        dnaTomRNA = new DNATomRNA();
    }

    @Test
    public void nothing(){
    }
    @Test
    public void givennull_returnsEmpty(){
        String converted = dnaTomRNA.convertTomRNA(null);
        assertEquals("", converted);
    }

    @Test
    public void givenString_returnsString(){
        String converted = dnaTomRNA.convertTomRNA("");
        assertEquals("", converted);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        String converted = dnaTomRNA.convertTomRNA(" ");
        assertEquals(" ", converted);
    }
}
