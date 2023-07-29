package com.improve10x.tdd.vani.howmanyds;

public class HowManyDs {
    public int countDs(String letter) {
        int result = 0;
        if ((letter == null) || letter.equals("")) {
            return 0;
        }
            if (letter.equalsIgnoreCase("D")) {
                return 1;
            }
        return result;
    }
}
