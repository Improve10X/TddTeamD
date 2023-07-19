package com.improve10x.tdd.supriya.countds;

public class CountDs {
    public int countDs(String sentence) {
        int result = 0;
        char c = 0;
        for (int i = 0; i < sentence.length(); i++) {
            c = sentence.charAt(i);
            if (c == 'd') {
                result++;
            } else if (c == 'D') {
                result++;
            }
        }
        return result;
    }
}
