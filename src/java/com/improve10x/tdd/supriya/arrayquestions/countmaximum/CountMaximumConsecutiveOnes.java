package com.improve10x.tdd.supriya.arrayquestions.countmaximum;

public class CountMaximumConsecutiveOnes {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length >=1) {
            if (numbers[0] == 1) {
                return 1;
            }
        }
        return 0;
    }
}
