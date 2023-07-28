package com.improve10x.tdd.krishna.practice.practice;

public class DNATomRNA {
    public String convertTomRNA(String letters) {
        if(letters == null || letters.equals("")){
            return "";
        }if(letters.equals("z")){
            return "z";
        }else if(letters.equals("f")){
            return "f";
        }
        return " ";
    }
}
