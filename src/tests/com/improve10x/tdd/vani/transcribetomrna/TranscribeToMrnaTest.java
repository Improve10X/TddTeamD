package com.improve10x.tdd.vani.transcribetomrna;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Transcribe To mRNA
//        Transcribe the given DNA strand into corresponding mRNA - a type of RNA, that will be formed from DNA after transcription. DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
//        Examples
//        dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"
//        dnaToRna("CGATATA") ➞ "GCUAUAU"
//        dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"
public class TranscribeToMrnaTest {
    TranscribeToMrna transcribeToMrna;
    @BeforeEach
    public void setUp(){
        transcribeToMrna = new TranscribeToMrna();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsEmptyString(){
        String  empty = transcribeToMrna.dnaToRna(null);
        assertEquals("", empty);
    }
}
