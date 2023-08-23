package com.improve10x.tdd.vani.edabitproblems.transcribetomrna;

import com.improve10x.tdd.vani.edabitproblems.transcribetomrna.TranscribeToMrna;
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
    @Test
    public void givenEmpty_returnsEmptyString(){
        String empty = transcribeToMrna.dnaToRna("");
        assertEquals("",empty);
    }
    @Test
    public void givenA_returnsU(){
        String u = transcribeToMrna.dnaToRna("A");
        assertEquals("U", u);
    }
    @Test
    public void givenT_returnsA(){
        String a = transcribeToMrna.dnaToRna("T");
        assertEquals("A", a);
    }
    @Test
    public void givenG_returnsC(){
        String c = transcribeToMrna.dnaToRna("G");
        assertEquals("C", c);
    }
    @Test
    public void givenC_returnsG(){
        String g = transcribeToMrna.dnaToRna("C");
        assertEquals("G", g);
    }
    @Disabled
    @Test
    public void givenZ_returnsZ(){
        String z = transcribeToMrna.dnaToRna("Z");
        assertEquals("Z", z);
    }
    @Test
    public void givenAT_returnsUA(){
        String ua = transcribeToMrna.dnaToRna("AT");
        assertEquals("UA", ua);
    }
    @Test
    public void givenATTA_returnsUAAU(){
        String uaau = transcribeToMrna.dnaToRna("ATTA");
        assertEquals("UAAU", uaau);
    }
    @Test
    public void integrationTest(){
        String UAAUCGCGCUAUAUGCGCAUG = transcribeToMrna.dnaToRna("ATTAGCGCGATATACGCGTAC");
        assertEquals("UAAUCGCGCUAUAUGCGCAUG", UAAUCGCGCUAUAUGCGCAUG);
        String GCUAUAU = transcribeToMrna.dnaToRna("CGATATA");
        assertEquals("GCUAUAU", GCUAUAU);
        String CAGUAUGCUGCAU = transcribeToMrna.dnaToRna("GTCATACGACGTA");
        assertEquals("CAGUAUGCUGCAU", CAGUAUGCUGCAU);
    }
}
