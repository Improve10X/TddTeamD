package com.improve10x.tdd.vani.checkifanarraysorted;

public class ArraySorted {

    public boolean checkIfAnArraySorted(int[] numbers) {
        if (numbers != null && numbers.length > 1 && numbers[0] > numbers[1]){
            return false;
        }
        return true;
    }
}
