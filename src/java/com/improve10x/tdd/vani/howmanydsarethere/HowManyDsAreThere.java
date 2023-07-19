package com.improve10x.tdd.vani.howmanydsarethere;

public class HowManyDsAreThere {
    public int countDs(String sentence) {
        int result = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ( c == 'D' ) {
                result++;
            } else if (c == 'd') {
                result++;
            }
        }
        return result;
    }
}
