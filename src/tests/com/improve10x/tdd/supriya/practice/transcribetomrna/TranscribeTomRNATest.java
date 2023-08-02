package com.improve10x.tdd.supriya.practice.transcribetomrna;

import com.improve10x.tdd.supriya.practice.trnscribetomrna.TranscribeTomRNA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Transcribe To mRNA
//        Transcribe the given DNA strand into corresponding mRNA - a type of RNA, that will be formed from DNA after transcription. DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
//        Examples
//        dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"
//        dnaToRna("CGATATA") ➞ "GCUAUAU"
//        dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"

public class TranscribeTomRNATest {
    TranscribeTomRNA transcribeTomRNA;

    @BeforeEach
    public void setUp() {
        transcribeTomRNA = new TranscribeTomRNA();

    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String empty = transcribeTomRNA.converted("");
        assertEquals("", empty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String empty = transcribeTomRNA.converted(null);
        assertEquals("", empty);
    }

    @Test
    public void givenA_returnU() {
        String findA = transcribeTomRNA.converted("A");
        assertEquals("U", findA);
    }

    @Test
    public void givenT_returnA() {
        String findT = transcribeTomRNA.converted("T");
        assertEquals("A", findT);
    }

    @Test
    public void givenG_returnC() {
        String findG = transcribeTomRNA.converted("G");
        assertEquals("C", findG);
    }

    @Test
    public void givenC_returnA() {
        String findG = transcribeTomRNA.converted("C");
        assertEquals("G", findG);
    }

    @Disabled
    @Test
    public void givenB_returnB() {
        String findB = transcribeTomRNA.converted("B");
        assertEquals("B", findB);
    }

    @Disabled
    @Test
    public void givenF_returnF() {
        String findF = transcribeTomRNA.converted("F");
        assertEquals("F", findF);
    }

    @Test
    public void givenAC_returnUG() {
        String findAC = transcribeTomRNA.converted("AC");
        assertEquals("UG", findAC);
    }

    @Test
    public void givenACT_returnUGA() {
        String findACT = transcribeTomRNA.converted("ACT");
        assertEquals("UGA", findACT);
    }

    @Test
    public void givenAG_returnUC() {
        String findAC = transcribeTomRNA.converted("AG");
        assertEquals("UC", findAC);
    }

    @Test
    public void given_returnA() {
        String findCGATATA = transcribeTomRNA.converted("CGATATA");
        assertEquals("GCUAUAU", findCGATATA);
    }

    @Test
    public void integrations_integrations() {
        String findCGATATA = transcribeTomRNA.converted("CGATATA");
        assertEquals("GCUAUAU", findCGATATA);
        String findATTAGCGCGATATACGCGTAC = transcribeTomRNA.converted("ATTAGCGCGATATACGCGTAC");
        assertEquals("UAAUCGCGCUAUAUGCGCAUG", findATTAGCGCGATATACGCGTAC);
        String findGTCATACGACGTA = transcribeTomRNA.converted("GTCATACGACGTA");
        assertEquals("CAGUAUGCUGCAU", findGTCATACGACGTA);
    }
}
//    dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"
//        dnaToRna("CGATATA") ➞ "GCUAUAU"
//        dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"

