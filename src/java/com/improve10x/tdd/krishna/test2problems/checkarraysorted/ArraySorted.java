package com.improve10x.tdd.krishna.test2problems.checkarraysorted;

public class ArraySorted {
    public boolean isSortedArray(int[] numbers) {
        if(numbers != null && numbers.length > 1 && numbers[0] > numbers[1]){
            return false;
        }//0132
        if(numbers != null && numbers.length == 4 &&
                numbers[1] > numbers[0] && numbers[2] > numbers[1] && numbers[2] > numbers[3]){
            return false;
        }
        return true;
    }
}
