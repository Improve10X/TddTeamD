package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNATomRNATest {

    @Test
    public void nothing(){
    }
    @Test
    public void givennull_returnsEmpty(){
        DNATomRNA dnaTomRNA = new DNATomRNA();
        String converted = dnaTomRNA.convertTomRNA(null);
        assertEquals("", converted);
    }
}
