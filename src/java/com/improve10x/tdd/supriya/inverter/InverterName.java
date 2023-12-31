package com.improve10x.tdd.supriya.inverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InverterName {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (isSingleWord(name)) {
            return name.trim();
        } else {
            return formatMultiElementName(name);
        }
    }

    private static boolean isSingleWord(String name) {
        return !name.trim().contains(" ");
    }

    private static String formatMultiElementName(String name) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        removeHonorifics(names);
        String postNominal = getPostNominal(names.subList(2, names.size()));
        return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
    }

    private static String getPostNominal(List<String> postNominalList) {
        String postNominal = "";
        for (int i = 0; i < postNominalList.size(); i++) {
            postNominal += postNominalList.get(i) + " ";
        }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mrs.|Mr.|Miss.") && names.size() > 2) {
            names.remove(0);
        }
    }
}
