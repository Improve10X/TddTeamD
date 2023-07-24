package com.improve10x.tdd.supriya.practice;

public class Combination {
    public int findCombination(int [] numbers) {
        int result = 1 ;
        for (int i = 0; i < numbers.length; i++){
            result = numbers[i] * result;
        }
        return result;
    }
}
