package com.improve10x.tdd.krishna.test2problems.singleone;

public class SingleOne {
    public int findSingle(int[] numbers) {
        if (numbers != null && numbers.length != 2 && numbers.length >= 1) {
            for (int i = 0; i < numbers.length; i++) {
                int count = 0;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }
}
