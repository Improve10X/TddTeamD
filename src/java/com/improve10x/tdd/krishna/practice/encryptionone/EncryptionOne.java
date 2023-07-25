package com.improve10x.tdd.krishna.practice.encryptionone;

public class EncryptionOne {
    public String encrypt(String word) {
        if(word != null) {
            String reversed = "";
            for(int i = word.length() - 1; i >= 0; i--){
                reversed = reversed + word.charAt(i);
            }
            reversed = reversed.replace('a', '0');
            reversed = reversed.replace('e', '1');
            reversed = reversed.replace('i', '2');
            reversed = reversed.replace('o', '3');
            reversed = reversed.replace('u', '4');
            if (word.equals("b")) {
                return word + "aca";
            }else {
                return reversed + "aca";
            }
        }
        return  "aca";
    }
}
