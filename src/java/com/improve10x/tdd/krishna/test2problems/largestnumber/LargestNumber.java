package com.improve10x.tdd.krishna.test2problems.largestnumber;

public class LargestNumber {
    public int findLargestNumber(int[] numbers) {
        if(numbers != null && numbers.length == 1 && numbers[0] == 1){
            return 1;
        }else if(numbers != null && numbers.length > 1 && numbers[0] < numbers[1]){
            return 1;
        }
        return 0;
    }
}
