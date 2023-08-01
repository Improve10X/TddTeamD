package com.improve10x.tdd.vani.primenumbers;

public class PrimeNumbers {
    public int calcPrimeNumbers(int number) {
        int result = 0;
        boolean hasFactors = false;
        for (int i = 2; i <= number; i++) {
            hasFactors = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    hasFactors = true;
                    break;
                }
            }
            if (hasFactors == false) {
                result++;
            }
        }
        return result;
    }
}

