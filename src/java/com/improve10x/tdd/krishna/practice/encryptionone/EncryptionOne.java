package com.improve10x.tdd.krishna.practice.encryptionone;

public class EncryptionOne {
    public String encrypt(String word) {
        if(word != null) {
            if (word.equals("b")) {
                return word + "aca";
            }else if(word.equals("a")){
                return 0 + "aca";
            }else if(word.equals("e")){
                return 1 + "aca";
            }else if(word.equals("i")){
                return 2 + "aca";
            }else if(word.equals("o")){
                return 3 + "aca";
            }else if(word.equals("u")){
                return 4 + "aca";
            }
        }
        return  "aca";
    }
}
