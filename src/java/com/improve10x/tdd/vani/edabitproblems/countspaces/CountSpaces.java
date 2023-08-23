package com.improve10x.tdd.vani.edabitproblems.countspaces;

public class CountSpaces {
    public int findSpaces(String word) {
        int count = 0;
        if (word != null) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == ' ') {
                    count++;
                }

            }
        }
        return count;
    }
}
