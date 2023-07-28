package com.improve10x.tdd.supriya.practice.trnscribetomrna;

public class TranscribeTomRNA {
    public String converted(String word) {
        if (word == "A"){
            return "U";
        } else if (word == "T") {
            return "A";
        }else if (word == "G"){
            return "C";
        }
        return "";
    }
}
