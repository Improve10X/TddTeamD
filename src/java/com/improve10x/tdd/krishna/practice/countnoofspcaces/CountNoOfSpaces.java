package com.improve10x.tdd.krishna.practice.countnoofspcaces;

public class CountNoOfSpaces {
    public int count(String word) {
        if(word != null){
            int count = 0;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(c == ' '){
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
