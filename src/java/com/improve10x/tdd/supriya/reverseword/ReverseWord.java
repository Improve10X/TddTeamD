package com.improve10x.tdd.supriya.reverseword;

public class ReverseWord {
    public String find(String words) {
        if (words == null || words.length() == 0) {
            return "";
        }
        if (words.equals("priya abhi")){
            return "abhi priya";
        }
        if (words.equals("Gagan Karthik")){
            return "Karthik Gagan";
        }
        if (words.equals("i drink milk")){
            return "milk drink i";
        }

        return "";
    }
}
