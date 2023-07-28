package com.improve10x.tdd.supriya.practice.trnscribetomrna;

public class TranscribeTomRNA {
    public String converted(String word) {
        String result = "";
        if ( word == null || word.equals("") ) {
            return "";
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'A') {
                result += "U";
            } else if (c == 'T') {
                result += "A";
            } else if (c == 'G') {
                result += "C";
            } else if (c == 'C') {
                result +="G";
            }
        }
        return result;
    }
}

