package com.improve10x.tdd.krishna.test2problems.singleone;

public class SingleOne {
    public int findSingle(int[] numbers) {
        if(numbers != null && numbers.length == 1) {
            return numbers[0];
        }
        return -1;
    }
}
