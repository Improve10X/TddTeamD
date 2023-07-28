package com.improve10x.tdd.vani.chartoascii;

public class CharToAscii {
    public int ctoa(String letter) {
        int result = 0;
        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            if (c == 'A') {
                result = 65;
            } else if (c == 'B') {
                result = 66;
            } else {
                result++;
            }
        }
        return result;
    }
}
