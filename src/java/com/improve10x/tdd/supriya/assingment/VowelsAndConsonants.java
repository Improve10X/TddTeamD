package com.improve10x.tdd.supriya.assingment;

public class VowelsAndConsonants {
    public String findVowelsOrConsonants(String character) {
        if ( character == "") {
            return "";
        } else if (character == null){
            return null;
        }else if (character == "a" || character == "e" || character == "e" || character == "i" ||character == "u") {
            return "vowel";
        }
        return "consonant";
    }
}

