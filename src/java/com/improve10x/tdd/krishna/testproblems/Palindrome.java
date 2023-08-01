package com.improve10x.tdd.krishna.testproblems;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if((word != null) && (word.length() >= 2)){
           // word = word.toLowerCase();
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }
            if (!word.equals(reverseWord)) {
                return false;
            }
        }
        return true;
    }
}
