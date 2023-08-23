package com.improve10x.tdd.vani.edabitproblems.chartoascii;

public class CharToAscii {
    public int ctoa(Character letter) {
        int result = 0;
       if (letter == null){
           return 0;
       }
        for (int i = 0; i < letter; i++){
            result++;
        }
        return result;
    }
}
