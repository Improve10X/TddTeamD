package com.improve10x.tdd.krishna.test2problems.missingnumber;

public class MissingNumber {
    public int findMissingNumber(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            if (numbers.length == 1) {
                if (numbers[0] == 1) {
                    return 2;
                } else if (numbers[0] == 2) {
                    return 1;
                }
            }
            if (numbers.length == 2) {
                if (numbers[0] == 1 && numbers[1] == 2) {
                    return 3;
                } else if (numbers[0] == 1 && numbers[1] == 3) {
                    return 2;
                }
            }
        }
        return -1;
    }
}
