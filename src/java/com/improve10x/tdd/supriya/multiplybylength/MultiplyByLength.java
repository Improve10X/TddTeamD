package com.improve10x.tdd.supriya.multiplybylength;

public class MultiplyByLength {
    public int[] findStatus(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            result[i] = numbers[i]*numbers.length;
        }
        return result;
    }
}
