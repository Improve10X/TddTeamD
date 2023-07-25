package com.improve10x.tdd.supriya.practice.encryptionalgorithem;

public class EncryptionAlgorithm {
    public String findEncryption(String word) {
        String result = "0";
        for (int i = word.length()-1; i >= 0; i--){
            char c = word.charAt(i);
            if (c == 'b'){
               result = "b";
            }else if (word.equals("a")){
                result ="0";
            }
        }
        return result;
    }
}
