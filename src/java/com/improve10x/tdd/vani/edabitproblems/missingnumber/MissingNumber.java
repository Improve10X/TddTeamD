package com.improve10x.tdd.vani.edabitproblems.missingnumber;

public class MissingNumber {

    public int findMissingNumber(int[] numbers) {
        if (numbers != null && numbers.length == 9){
            int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }
            return 55 - sum;
        }
        return -1;
    }
}
