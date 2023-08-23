package com.improve10x.tdd.vani.edabitproblems.howmanyds;

public class HowManyDs {
    public int countDs(String letter) {
        int result = 0;
        if ((letter == null) || letter.equals("")) {
            return 0;
        }
            for (int i = 0; i < letter.length(); i++){
                char c = letter.charAt(i);
               if(c == 'D' || c == 'd'){
                   result += 1;
               }
            }
        return result;
    }
}
