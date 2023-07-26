package com.improve10x.tdd.supriya.practice.encryptionalgorithem;

public class EncryptionAlgorithm {
    public String findEncrypt(String word) {
        if (word != null) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }
            reverseWord = reverseWord.replace('a', '0');
            reverseWord = reverseWord.replace('e', '1');
            reverseWord = reverseWord.replace('i', '2');
            reverseWord = reverseWord.replace('o', '3');
            reverseWord = reverseWord.replace('u', '4');
            return reverseWord + "aca";
        } else {
            return  "aca";
        }
    }
}
