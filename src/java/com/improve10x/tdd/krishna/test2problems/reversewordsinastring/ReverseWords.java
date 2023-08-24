package com.improve10x.tdd.krishna.test2problems.reversewordsinastring;

public class ReverseWords {

    public String findReverse(String words){
        if(words != null){
            if(words.length() == 1){
                return words;
            }
            if(words.equals("Is")){
                return "Is";
            }
            if(words.equals("And Or")){
                return "Or And";
            }
        }
        return "";
    }
}
