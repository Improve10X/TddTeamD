package com.improve10x.tdd.vani.transcribetomrna;

public class TranscribeToMrna {
    public String dnaToRna(String letter) {
        if ((letter == null) || (letter.equals(""))) {
            return "";
        }
        String result = "";
        for (int i = 0; i < letter.length(); i++) {
        char c = letter.charAt(i);
            if (c == 'A') {
                result += "U";
            } else if (c == 'T') {
                result += "A";
            } else if (c == 'G') {
                result += "C";
            } else if (c == 'C') {
                result += "G";
            }
        }
        return result;
    }
}
