package com.improve10x.tdd.krishna.test2problems.maxconsecutiveones;

public class MaxConsecutiveOnes {
    public int findMaxOnes(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int count = 0;
        int maximum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maximum = Math.max(maximum, count);
        }
        return maximum;
    }
}
