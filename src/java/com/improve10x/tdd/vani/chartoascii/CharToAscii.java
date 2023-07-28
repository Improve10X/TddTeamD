package com.improve10x.tdd.vani.chartoascii;

public class CharToAscii {
    public int ctoa(String letter) {
        int result = 0;
        if (letter.equals(" ")){
            result = 32;
        } else if (letter.equals("A")) {
            result = 65;
        }
        return result;
    }
}
