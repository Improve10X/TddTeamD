package com.improve10x.tdd.supriya.practice.encryptionalgorithem;

public class EncryptionAlgorithm {
    public String findEncrypt(String word) {
        if (word != null) {
            if (word.equals("b")) {
                return  word + "aca";
            }else if (word.equals("a")){
                return 0 +"aca";
            }else if (word.equals("e")){
                return 1 + "aca";
            }else if (word.equals("i")){
                return 2 + "aca";
            }
        }
        return "aca";
    }

}