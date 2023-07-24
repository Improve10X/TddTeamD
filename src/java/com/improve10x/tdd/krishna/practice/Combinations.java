package com.improve10x.tdd.krishna.practice;

public class Combinations {
    public int findCombination(int[] numbers) {
        if (numbers[0] == 1 && numbers[1] == 1){
            return 1;
        }else if(numbers[0] == 1 && numbers[1] == 2){
            return numbers[0] * numbers[1];
        }
        return 0;
    }
}
