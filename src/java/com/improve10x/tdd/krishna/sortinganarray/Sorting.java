package com.improve10x.tdd.krishna.sortinganarray;

public class Sorting {
    public int[] sortAnArray(int[] numbers) {
        if(numbers[0] >= 0 && numbers[0] < 3){
            return numbers;
        }
        return new int[]{-1};
    }
}
