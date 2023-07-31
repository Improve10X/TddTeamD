package com.improve10x.tdd.krishna.practice.practice;

public class HowManyPrimeNumbers {
    public int findPrimeNumbers(int number) {
        int result = 0;
        if (number >= 2) {
            if(number % 1 == 0 && (number % number) == 0){
                result = 1;
            }
        }
        return result;
    }
}
