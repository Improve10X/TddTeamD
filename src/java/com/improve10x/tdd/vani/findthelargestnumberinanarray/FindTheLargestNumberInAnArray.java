package com.improve10x.tdd.vani.findthelargestnumberinanarray;

public class FindTheLargestNumberInAnArray {

    public int findLargestNum(int[] numbers) {
        if(numbers != null) {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                    return numbers[numbers.length - 1];
                }
            }
        }
        return 0;
    }
}
