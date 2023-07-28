package com.improve10x.tdd.krishna.practice.practice;

public class DNATomRNA {
    public String convertTomRNA(String letters) {
        if(letters == null || letters.equals("")){
            return "";
        }if(letters.equals(" ")){
            return " ";
        } else if (letters.equals("A")) {
            return "U";
        }else if (letters.equals("T")) {
            return "A";
        }else if (letters.equals("G")) {
            return "C";
        }
        return letters;
    }
}
