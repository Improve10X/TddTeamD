package com.improve10x.tdd.krishna.test2problems.reversewordsinastring;

import java.util.ArrayList;

public class ReverseWords {

    public String findReverse(String words) {
        if (words == null || words.length() == 0) {
            return "";
        } else {
            String[] sentence = words.trim().split("\\s+");
            StringBuilder reverseWord = new StringBuilder();
            for (int i = sentence.length - 1; i >= 0; i--) {
                reverseWord.append(sentence[i]);
                if (i > 0) {
                    reverseWord.append(" ");
                }
            }
            return reverseWord.toString();
        }
    }
}
