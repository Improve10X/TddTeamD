package com.improve10x.tdd.krishna.test2problems.moveallzerostoend;

public class AllZerosToTheEnd {
    public int[] moveAllZerosToTheEnd(int[] numbers) {
        if(numbers != null && numbers.length == 1){
            return numbers;
        }
        if(numbers != null && numbers.length == 2){
            if(numbers[0] == 0){
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
                return numbers;
            }
            return numbers;
        }
        return new int[]{-1};
    }
}
