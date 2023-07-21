package com.improve10x.tdd.team.nameinverterone;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverterOne {
    public String invertName(String word) {
        if (word.equals("")){
            return "";
        }else if (!word.trim().contains(" ")){
            return word.trim();
        }else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(word.trim().split("\\s+")));
            if (names.get(0).matches("Mr.|Mrs.|Miss.") && names.size()>2){
                names.remove(0);
            }
            return names.get(1) + ", " + names.get(0);
        }
    }
}
