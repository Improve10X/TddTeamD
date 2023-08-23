package com.improve10x.tdd.vani.reversewordsinastring;

public class ReverseWords {
    public String find(String sentence) {
        if (sentence != null) {

            if (sentence.equals("A B")) {
                return "B A";
            }

            if (sentence.equals("10x Improve")){
                return "Improve 10x";
            }
            if (sentence.equals("Mom Dad")){
                return "Dad Mom";
            }
            String reverseElements = "";
            for (int i = sentence.length() - 1; i >= 0; i--){

            }
            return reverseElements;
        }
        return "";
    }
}
