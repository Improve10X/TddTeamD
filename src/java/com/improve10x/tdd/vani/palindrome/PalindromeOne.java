package com.improve10x.tdd.vani.palindrome;

public class PalindromeOne {
    public boolean isPalindromeTest(String text) {
        boolean result = false;
        if (text != null) {
            String reverseWord = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + text.charAt(i);
            }
            if (text.equals(reverseWord)) {
                result = true;
            }
        }
        return result;
    }
}

