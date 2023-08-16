package com.improve10x.tdd.krishna.test2problems.missingnumber;

public class MissingNumber {
    public int findMissingNumber(int[] numbers) {
        int result = -1;
        if (numbers != null && numbers.length >= 1 && numbers[0] != 0) {
            for (int i = 0; i < numbers.length; i++) {//2,1
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
                if (numbers[i] != i + 1) {
                    result = i + 1;
                    break;
                } else {
                    result = numbers[i] + 1;
                }
            }
        }
        return result;
    }
}

