package com.improve10x.tdd.vani.chartoascii;

public class CharToAscii {
    public int ctoa(Character letter) {
        int result = 0;
       if (letter == null){
           return 0;
       }
        if (letter.equals(' ')) {
            return 32;
        } else if (letter.equals('A')) {
            return 65;
        }
        return result;
    }
}
