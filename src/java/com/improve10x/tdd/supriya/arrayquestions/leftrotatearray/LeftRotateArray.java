package com.improve10x.tdd.supriya.arrayquestions.leftrotatearray;

public class LeftRotateArray {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            int temp = numbers[0];
            for (int i = 0; i <= numbers.length - 2; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
            return numbers;
        }
        return new int[]{};
    }
}

