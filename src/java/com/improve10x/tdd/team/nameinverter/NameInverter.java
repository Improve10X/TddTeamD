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
            String postNominal = "";
            for (int i = 2; i < names.size(); i++){
                 postNominal += names.get(i)+ " ";
            }
            return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
        }
    }







    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("mr.|mrs.|miss.")){
            names.remove(0);
        }
    }
}
