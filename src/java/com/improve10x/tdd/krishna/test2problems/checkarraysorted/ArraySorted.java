package com.improve10x.tdd.krishna.test2problems.checkarraysorted;

public class ArraySorted {
    public boolean isSortedArray(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
