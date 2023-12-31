package com.improve10x.tdd.krishna.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

    @Disabled
    @Test
    public void givenz_returnsz(){
        String converted = dnaTomRNA.convertTomRNA("z");
        assertEquals("z", converted);
    }

    @Disabled
    @Test
    public void givenf_returnsf(){
        String converted = dnaTomRNA.convertTomRNA("f");
        assertEquals("f", converted);
    }

    @Disabled
    @Test
    public void givenk_returnsk(){
        String converted = dnaTomRNA.convertTomRNA("k");
        assertEquals("k", converted);
    }

    @Test
    public void givenA_returnsU(){
        String converted = dnaTomRNA.convertTomRNA("A");
        assertEquals("U", converted);
    }

    @Test
    public void givenT_returnsA(){
        String converted = dnaTomRNA.convertTomRNA("T");
        assertEquals("A", converted);
    }

    @Test
    public void givenG_returnsC(){
        String converted = dnaTomRNA.convertTomRNA("G");
        assertEquals("C", converted);
    }

    @Test
    public void givenC_returnsG(){
        String converted = dnaTomRNA.convertTomRNA("C");
        assertEquals("G", converted);
    }

    @Test
    public void givenAT_returnsUA(){
        String converted = dnaTomRNA.convertTomRNA("AT");
        assertEquals("UA", converted);
    }

    @Test
    public void givenGC_returnsCG(){
        String converted = dnaTomRNA.convertTomRNA("GC");
        assertEquals("CG", converted);
    }

    @Test
    public void givenATGC_returnsUACG(){
        String converted = dnaTomRNA.convertTomRNA("ATGC");
        assertEquals("UACG", converted);
    }

    @Test
    public void integrationTest(){
        String converted = dnaTomRNA.convertTomRNA("ATTAGCGCGATATACGCGTAC");
        assertEquals("UAAUCGCGCUAUAUGCGCAUG", converted);
        String result = dnaTomRNA.convertTomRNA("CGATATA");
        assertEquals("GCUAUAU", result);
        String result1 = dnaTomRNA.convertTomRNA("GTCATACGACGTA");
        assertEquals("CAGUAUGCUGCAU", result1);
    }
}
