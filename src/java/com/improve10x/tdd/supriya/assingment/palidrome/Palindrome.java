package com.improve10x.tdd.supriya.assingment.palidrome;

public class Palindrome {
    public boolean findStatus(String word) {
        boolean result = false;
        if (word != null) {
            String reversWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversWord = reversWord + word.charAt(i);
            }
            if (word.equals(reversWord)) {
                return true;
            }
        }
        return result;
    }
}

