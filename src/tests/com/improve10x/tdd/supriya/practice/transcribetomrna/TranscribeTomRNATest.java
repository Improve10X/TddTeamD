package com.improve10x.tdd.supriya.practice.transcribetomrna;

import com.improve10x.tdd.supriya.practice.trnscribetomrna.TranscribeTomRNA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
