package com.improve10x.tdd.vani.transcribetomrna;

public class TranscribeToMrna {
    public String dnaToRna(String letter) {
        if ((letter == null) || (letter.equals(""))) {
            return "";
        }
            for (int i = 0; i < letter.length(); i++) {
                char c = letter.charAt(i);
                if (c == 'A') {
                    return "U";
                } else if (c == 'T') {
                    return "A";
                }
            }
        return letter;
    }
}
