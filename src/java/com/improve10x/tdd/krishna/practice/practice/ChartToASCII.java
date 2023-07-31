package com.improve10x.tdd.krishna.practice.practice;

public class ChartToASCII {
    public int findASCIIValue(Character character) {
        int result = 0;
        if(character != null){
            for(int i = 0; i < character; i++){
                result++;
            }if(character == ' '){
                result = 32;
            }
        }
        return result;
    }
}
