package com.improve10x.tdd.krishna.practice.practice;

public class MissingNumber {
    public static int findMissingNumber(int[] numbers) {
        if(numbers != null && numbers.length == 9){
            int sum = 0;
            for(int i = 0; i < 9; i++){
                sum = sum + numbers[i];
            }
            return 55 - sum;
        }
       return -1;
    }
}