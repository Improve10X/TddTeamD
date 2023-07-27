package com.improve10x.tdd.krishna.practice.countnoofspcaces;

public class CountNoOfSpaces {
    public int count(String word) {
        if(word != null){
            if(word.contains(" ")){
                return 1;
            }
        }
        return 0;
    }
}
