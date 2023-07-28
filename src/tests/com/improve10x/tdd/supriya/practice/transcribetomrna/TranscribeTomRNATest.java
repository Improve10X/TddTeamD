package com.improve10x.tdd.supriya.practice.transcribetomrna;

import com.improve10x.tdd.supriya.practice.trnscribetomrna.TranscribeTomRNA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Transcribe To mRNA
//        Transcribe the given DNA strand into corresponding mRNA - a type of RNA, that will be formed from DNA after transcription. DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
//        Examples
//        dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"
//        dnaToRna("CGATATA") ➞ "GCUAUAU"
//        dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"

public class TranscribeTomRNATest {

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty(){
        TranscribeTomRNA transcribeTomRNA = new TranscribeTomRNA();
        String empty = transcribeTomRNA.converted("");
        Assertions.assertEquals("",empty);
    }

    @Test
    public void givenNull_returnEmpty(){
        TranscribeTomRNA transcribeTomRNA = new TranscribeTomRNA();
        String empty = transcribeTomRNA.converted(null);
        Assertions.assertEquals("",empty);
    }

    @Test
    public void givenA_returnU(){
        TranscribeTomRNA transcribeTomRNA = new TranscribeTomRNA();
        String findA = transcribeTomRNA.converted("A");
        Assertions.assertEquals("U", findA);
    }

    @Test
    public void givenT_returnA(){
        TranscribeTomRNA transcribeTomRNA = new TranscribeTomRNA();
        String findT = transcribeTomRNA.converted("T");
        Assertions.assertEquals("A",findT);
    }

    @Test
    public void givenG_returnA(){
        TranscribeTomRNA transcribeTomRNA = new TranscribeTomRNA();
        String findG = transcribeTomRNA.converted("G");
        Assertions.assertEquals("C",findG);
    }
}
