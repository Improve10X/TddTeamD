package com.improve10x.tdd.krishna.practice.encryption;

public class Encryption {
    public String findEncryption(String word) {
        String result = "0";
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i); //ab
            if(c == 'a'){
                result = "0";
            }else if(c == 'b'){
                result = " " + c;
            }
        }
        return result;
    }

    public String encrypt(String word) {
        if(word != null){
            word = word.toLowerCase();
            String reverseWord = "";
            for(int i = word.length() - 1; i >= 0; i--){
                reverseWord = reverseWord + word.charAt(i);
            }
            reverseWord = reverseWord.replace('a', '0');
            reverseWord = reverseWord.replace('e', '1');
            reverseWord = reverseWord.replace('i', '2');
            reverseWord = reverseWord.replace('o', '3');
            reverseWord = reverseWord.replace('u', '4');
            return reverseWord + "aca";
        }else{
            return "aca";
        }
    }
}
