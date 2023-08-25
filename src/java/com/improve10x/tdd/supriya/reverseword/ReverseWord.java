package com.improve10x.tdd.supriya.reverseword;

public class ReverseWord {
    public String find(String words) {
        if (words == null || words.length() == 0) {
            return "";
        }else {
            String [] sentence = words.trim().split("\\s+");
            StringBuilder reverseWord = new StringBuilder();
            for (int i = sentence.length -1; i>=0 ; i--){
                reverseWord.append(sentence[i]);
                if (i > 0){
                    reverseWord.append(" ");
                }
            }
            return reverseWord.toString();
        }
    }
}
//        if (words.equals("priya abhi")){
//            return "abhi priya";
//        }
//        if (words.equals("Gagan Karthik")){
//            return "Karthik Gagan";
//        }
//        if (words.equals("i drink milk")){
//            return "milk drink i";
//


