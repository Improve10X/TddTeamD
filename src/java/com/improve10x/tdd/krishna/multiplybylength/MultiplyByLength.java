package com.improve10x.tdd.krishna.multiplybylength;

public class MultiplyByLength {

    public int[] findMultiplyByLength(int[] numbers){
        int length = numbers.length;
        int[] result = new int[length];
        for(int i = 0; i < length; i++){
            result[i] = numbers[i] * length;
        }
        return result;
    }
}
