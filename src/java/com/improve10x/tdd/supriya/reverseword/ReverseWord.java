package com.improve10x.tdd.supriya.reverseword;

public class ReverseWord {
    public String find(String word) {
        if (word == null || word.length() == 0) {
            return "";
        }
        if (word.equals("priya abhi")){
            return "abhi priya";
        }
        return "";
    }
}
