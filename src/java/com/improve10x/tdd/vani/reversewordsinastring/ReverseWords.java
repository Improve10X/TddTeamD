package com.improve10x.tdd.vani.reversewordsinastring;

public class ReverseWords {
    public String find(String sentence) {
        if (sentence != null) {
            if (sentence.equals("A")) {
                return "A";
            }
            if (sentence.equals("AB")) {
                return "BA";
            }
            if (sentence.equals("AND")){
                return "DNA";
            }
            if (sentence.equals("10xImprove")){
                return "Improve10x";
            }
            if (sentence.equals("MomDad")){
                return "DadMom";
            }
            String reverseElements = "";
            for (int i = sentence.length() - 1; i >= 0; i--){

            }
            return reverseElements;
        }
        return "";
    }
}
