package com.improve10x.tdd.krishna.practice.vowelorconsonant;

public class VowelOrConsonant {
    public String isVowelOrConsonant(String character) {
        if (character == null || character.equals("") || character.equals(" ")) {
            return character;
        } else if (character.equals("a")) {
            return "vowel";
        } else if (character.equals("e")) {
            return "vowel";
        } else if (character.equals("i")) {
            return "vowel";
        } else if (character.equals("o")) {
            return "vowel";
        }else if (character.equals("u")) {
            return "vowel";
        }else {
            return "consonant";
        }
    }
}
