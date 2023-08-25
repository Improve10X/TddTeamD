package com.improve10x.tdd.vani.reversewordsinastring;

public class ReverseWords {
    public String find(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return "";
        } else {
           String[] words = sentence.trim().split("\\s+");
           StringBuilder reverseWord = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reverseWord.append(words[i]);
                if (i > 0){
                    reverseWord.append(" ");
                }
            }
            return reverseWord.toString();
        }
    }
}

