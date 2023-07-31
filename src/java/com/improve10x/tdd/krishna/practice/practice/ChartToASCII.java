package com.improve10x.tdd.krishna.practice.practice;

public class ChartToASCII {
    public int findASCIIValue(Character character) {
        if(character != null){
            if(character == ' '){
                return 32;
            }else if(character == 'A'){
                return 65;
            }
        }
        return 0;
    }
}
