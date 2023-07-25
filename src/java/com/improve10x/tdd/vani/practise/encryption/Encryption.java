package com.improve10x.tdd.vani.practise.encryption;

public class Encryption {
    public String encrypt(String word) {
        if (word != null) {
            if (word.equals("b")) {
                return word + "aca";
            } else if (word.equals("a")) {
                return 0 + "aca";
            } else if (word.equals("e")) {
                return 1 + "aca";
            } else if (word.equals("i")) {
                return 2 + "aca";
            } else if (word.equals("o")) {
                return 3 + "aca";
            }
        }
        return "aca";
    }
}
