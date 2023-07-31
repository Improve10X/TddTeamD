package com.improve10x.tdd.vani.primenumbers;

public class PrimeNumbers {
    public int calcPrimeNumbers(int number) {
        int result = 0;
            for (int i = 2; i <= number; i++) {
                if (number % i != 0 || number % number == 0) {
                    result++;
                } else if (number % i == 0) {
                    return number;
                }
            }
        return result;
    }
}
