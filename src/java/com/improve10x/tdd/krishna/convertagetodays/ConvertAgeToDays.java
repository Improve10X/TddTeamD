package com.improve10x.tdd.krishna.convertagetodays;

public class ConvertAgeToDays {

    public int convertAgeToDays(int number){
        int result = 0;
        if(number >= 0){
            result = (number * 365);
        }
        return result;
    }
}
