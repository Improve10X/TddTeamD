package com.improve10x.tdd.supriya.assingment;

public class VowelsAndConsonants {
    public String findVowelsOrConsonants(String character) {
        if (character == null || character == "") {
            return null;
        } else if (character == "a") {
            return "vowel";
        } else if (character == "e") {
            return "vowel";
        } else if (character == "i") {
            return "vowel";
        } else if (character == "o") {
            return "vowel";
        } else if (character == "u") {
            return "vowel";
        }
        return "consonant";
    }
}

