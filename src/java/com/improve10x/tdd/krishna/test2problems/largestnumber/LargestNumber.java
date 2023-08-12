package com.improve10x.tdd.krishna.test2problems.largestnumber;

public class LargestNumber {
    public int findLargestNumber(int[] numbers) {
        if(numbers != null && numbers.length >= 1){
            if(numbers.length == 1){
                return numbers[0];
            }else if(numbers[0] < numbers[1] || numbers[0] == numbers[1]){
                return numbers[1];
            }
        }
        return 0;
    }
}
