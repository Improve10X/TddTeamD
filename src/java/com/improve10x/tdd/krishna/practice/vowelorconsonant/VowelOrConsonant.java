package com.improve10x.tdd.krishna.practice.vowelorconsonant;

public class VowelOrConsonant {
    public String isVowelOrConsonant(String text) {
        if (text == null || text.equals("") || text.equals(" ") || text.equals("0")) {
            return text;
        } else if (text.equals("a")) {
            return "vowel";
        } else if (text.equals("e")) {
            return "vowel";
        } else if (text.equals("i")) {
            return "vowel";
        } else if (text.equals("o")) {
            return "vowel";
        }else if (text.equals("u")) {
            return "vowel";
        }else {
            return "consonant";
        }
    }
}
