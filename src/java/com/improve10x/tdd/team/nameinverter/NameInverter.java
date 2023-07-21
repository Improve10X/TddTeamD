package com.improve10x.tdd.team.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
            for (int i = 0; i < names.size(); i++) {
            }
            removeHonorifics(names);
            String postNominal = names.size() > 2 ? names.get(2) : "";
            return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
        }
    }







    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("mr.|mrs.|miss.")){
            names.remove(0);
        }
    }
}
