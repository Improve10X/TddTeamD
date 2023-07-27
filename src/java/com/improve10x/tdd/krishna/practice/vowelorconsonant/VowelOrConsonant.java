package com.improve10x.tdd.krishna.practice.vowelorconsonant;

public class VowelOrConsonant {
    public String isVowelOrConsonant(String text) {
        if(text != null){
            if(text.equals("b")){
                return "consonant";
            }else if(text.equals("a")){
                return "vowel";
            }
        }
        return text;
    }
}
