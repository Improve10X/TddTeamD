package com.improve10x.tdd.team.nameinverterone;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverterOne {
    public String invertName(String word) {
        if (word.equals("")) {
            return "";
        } else if (!word.trim().contains(" ")) {
            return word.trim();
        } else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(word.trim().split("\\s+")));
            removeHonorifics(names);
            String postnominals = "";
            if (names.size() > 2) {
                for (int i = 2; i < names.size(); i++) {
                    postnominals += names.get(i) + "";
                }
            }
            return (names.get(1) + ", " + names.get(0) + " " + postnominals).trim();
        }
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mr.|Mrs.|Miss.") && names.size() > 2) {
            names.remove(0);
        }
    }
}
