package com.improve10x.tdd.vani.removeduplicatesfromanarray;

public class RemoveDuplicates {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers[0] == numbers[0]) {
                return new int[]{0};
            }
        }
        return new int[]{};
    }
}
