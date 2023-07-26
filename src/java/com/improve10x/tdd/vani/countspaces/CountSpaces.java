package com.improve10x.tdd.vani.countspaces;

public class CountSpaces {
    public int findSpaces(String word) {
        int count = 0;
        if (word != null) {
            for (int i = 0; i < word.length(); i++) {
                if (word.contains(" ")) {
                   return 1;
                }
            }
        }
        return count;
    }
}
