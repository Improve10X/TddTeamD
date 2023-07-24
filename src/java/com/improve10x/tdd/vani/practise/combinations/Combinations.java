package com.improve10x.tdd.vani.practise.combinations;

public class Combinations {
    public int combination(int[] numbers) {
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++){
            multiply *= numbers[i];
        }
        return multiply;
    }
}
