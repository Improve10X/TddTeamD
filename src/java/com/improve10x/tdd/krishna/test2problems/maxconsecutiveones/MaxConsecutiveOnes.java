package com.improve10x.tdd.krishna.test2problems.maxconsecutiveones;

public class MaxConsecutiveOnes {
    public int findMaxOnes(int[] numbers) {
        if (numbers != null && numbers.length == 1 && numbers[0] == 1){
            return 1;
        }
        return 0;
    }
}
