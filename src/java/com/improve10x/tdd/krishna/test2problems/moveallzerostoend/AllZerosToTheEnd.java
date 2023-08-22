package com.improve10x.tdd.krishna.test2problems.moveallzerostoend;

public class AllZerosToTheEnd {
    public int[] moveAllZerosToTheEnd(int[] numbers) {
        if(numbers != null && numbers.length == 1){
            return new int[]{numbers[0]};
        }
        return new int[]{-1};
    }
}
