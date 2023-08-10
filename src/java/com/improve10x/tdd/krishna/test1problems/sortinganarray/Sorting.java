package com.improve10x.tdd.krishna.test1problems.sortinganarray;

public class Sorting {
    public int[] sortAnArray(int[] numbers) {
        if (numbers[0] >= 0 && numbers[0] < 3 ) {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if(numbers[i] > 2){
                        return new int[]{-1};
                    } else if(numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            return numbers;
        }
        return new int[]{-1};
    }
}
