package com.improve10x.tdd.vani.checkifanarraysorted;

public class ArraySorted {

    public boolean checkIfAnArraySorted(int[] numbers) {
        if (numbers != null && numbers.length > 1 ) {
            if (numbers.length == 2) {
                if (numbers[0] < numbers[1]) {
                    return true;
                }
                if (numbers[0] > numbers[1]) {
                    return false;
                }
                } else if (numbers.length == 3) {
                if (numbers[0] > numbers[1] && numbers[1] < numbers[2]) {
                    return false;
                }
                if (numbers[0] < numbers[1] && numbers[1] > numbers[2]) {
                    return false;
                }
                if (numbers[0] > numbers[1] && numbers[1] > numbers[2]) {
                    return false;
                }
            } else if (numbers.length == 4) {
                if (numbers[0] > numbers[1] && numbers[1] < numbers[2] && numbers[2] < numbers[3]) {
                    return false;
                }
            }
        }
        return true;
    }
}
