package com.improve10x.tdd.supriya.practice.howmanyprimenumbers;

public class HowManyPrimeNumbers {
    public int findPrimeNumber(int numbers) {
        int count = -1;
        if (numbers == 0 || numbers == 1) {
            count = 0;
        } else if (numbers >= 2) {
            count = 0;
            for (int i = 2; i <= numbers; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n >= 2 ) {
            for (int i = 2; i <= n; i++) {
                if (n % i != 0 || n == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
