package com.improve10x.tdd.krishna.practice.practice;

public class DNATomRNA {
    public String convertTomRNA(String letters) {
        if(letters == null || letters.equals("")){
            return "";
        } else  if(letters.equals(" ")){
            return " ";
        }
        String result = "";
        for(int i = 0; i < letters.length(); i++){
            char c = letters.charAt(i);
            if(c == 'A'){
                result += "U";
            }else if(c == 'T'){
                result += "A";
            }else if(c == 'G'){
               result += "C";
            }else if(c == 'C'){
                result += "G";
            }
        }
        return result;
    }
}