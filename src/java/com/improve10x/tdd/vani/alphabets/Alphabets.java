package com.improve10x.tdd.vani.alphabets;

public class Alphabets {
    public String findVowelsOrConsonents(String letter) {
        String result = "";
        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result = "vowels";
            }else{
                result = "consonents";
            }
        }
        return result;
    }
}
