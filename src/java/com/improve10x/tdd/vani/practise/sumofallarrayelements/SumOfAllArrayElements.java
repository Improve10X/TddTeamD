package com.improve10x.tdd.vani.practise.sumofallarrayelements;

public class SumOfAllArrayElements {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
