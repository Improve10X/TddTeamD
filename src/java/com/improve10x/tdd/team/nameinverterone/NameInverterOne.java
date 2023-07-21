package com.improve10x.tdd.team.nameinverterone;

public class NameInverterOne {
    public String invertName(String word) {
        if (word.equals("")){
            return "";
        }else if (!word.contains(" ")){
            return word;
        }
        return null;
    }
}
