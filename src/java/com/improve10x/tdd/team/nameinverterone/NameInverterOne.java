package com.improve10x.tdd.team.nameinverterone;

public class NameInverterOne {
    public String invertName(String word) {
        if (word.equals("")){
            return "";
        }else if (!word.trim().contains(" ")){
            return word.trim();
        }else {
            String[] names = word.trim().split("\\s+");
            return names[1] + ", " + names[0];
        }
    }
}
