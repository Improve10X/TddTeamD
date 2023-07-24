package com.improve10x.tdd.krishna.practice;

public class Combinations {
    public int findCombination(int[] numbers) {
        int result = 1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                result = numbers[i] * result;
            }else {
                result = 0;
            }
        }
        return result;
    }
}
