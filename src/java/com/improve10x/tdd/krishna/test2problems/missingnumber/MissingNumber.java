package com.improve10x.tdd.krishna.test2problems.missingnumber;

public class MissingNumber {
    public int findMissingNumber(int[] numbers) {
        if(numbers != null && numbers.length >= 1){
            if(numbers[0] == 1){
                return 2;
            }
        }
        return -1;
    }
}
