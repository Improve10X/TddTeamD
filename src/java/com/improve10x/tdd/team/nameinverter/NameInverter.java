package com.improve10x.tdd.team.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")){
            return name.trim();
        }else {
            ArrayList<String> names =  new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
            for (int i = 0; i < names.size(); i++){
                if (names.get(0).matches("ms.|mrs.|miss.")){
                    names.remove(0);
                }
            }
            return names.get(1) + ", " + names.get(0);
        }
    }
}
