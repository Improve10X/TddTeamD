package com.improve10x.tdd.supriya.practice.howmanyprimenumbers;

public class HowManyPrimeNumbers {
    public int findPrimeNumber(int numbers) {
        int count = 0;
        for (int i = 2; i <= numbers; i++) {
            if (numbers % i == 0 || numbers % numbers == 0) {
                count++;
            }
        }
        return count;
    }
}