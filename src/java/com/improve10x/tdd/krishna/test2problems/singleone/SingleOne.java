package com.improve10x.tdd.krishna.test2problems.singleone;

public class SingleOne {
    public int findSingle(int[] numbers) {
        if(numbers != null && numbers.length == 1) {
            return numbers[0];
        }
        if(numbers != null && numbers.length >= 3){
            if(numbers.length == 3 && numbers[0] != numbers[1] && numbers[1] == numbers[2]){
                return numbers[0];
            }
            if(numbers[0] != numbers[1] && numbers[0] == numbers[2]){
                return numbers[1];
            }
            if(numbers[0] == numbers[1] && numbers[0] != numbers[2]){
                return numbers[2];
            }
        }
        return -1;
    }
}
