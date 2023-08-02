package com.improve10x.tdd.krishna.practice.practice;

public class HowManyPrimeNumbers {
    public int findPrimeNumbers(int number) {
        int result = 0;
        if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 1 || number % number == 0) {
                    result++;
                }
            }
        }
        return result;
    }


    public boolean isPrime(int n) {
        return false;
    }
}
