package com.improve10x.tdd.supriya.findthemissingletter;

public class MissingNumber {
    public static int findTheMissingNumber(int[] numbers) {
        if (numbers != null && numbers.length == 9) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return 55 - sum;
        }
        return -1;
    }
}
