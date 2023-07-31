package com.improve10x.tdd.supriya.chartoascii;

public class CharToASCII {
    public int findValue(Character character) {
        int result = 0;
        if (character == null){
            return 0;
        }for (int i = 0; i < character;i++){
            result++;
        }
        return result;
    }
}
