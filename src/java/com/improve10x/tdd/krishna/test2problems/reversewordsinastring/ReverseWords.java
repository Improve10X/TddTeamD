package com.improve10x.tdd.krishna.test2problems.reversewordsinastring;

public class ReverseWords {

    public String findReverse(String words){
        if(words != null && words.length() == 1){
            return words;
        }
        return "";
    }
}
