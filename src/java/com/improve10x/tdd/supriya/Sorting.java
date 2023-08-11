package com.improve10x.tdd.supriya;

public class Sorting {
    public int[] findNumber(int[] numbers) {
        if (numbers.length >1){
            for (int i = 0; i < numbers.length; i++){
                for (int j = i +1; j < numbers.length; j++){
                    if (numbers[i] > numbers[j]){
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            return numbers;
        }
        return new int[]{0};
    }
}
