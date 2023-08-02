package com.improve10x.tdd.krishna.practice.practice;

public class HowManyPrimeNumbers {
    public int findPrimeNumbers(int number) {
        int count = 0;
        if(number == -1){
            count = -1;
        } else if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }
        return count;
    }


    public boolean isPrime(int n) {
        boolean result = false;
        if(n >= 2){
            for(int i = 2; i <= n; i++){
                if(n % i != 0 || n == 2){
                    result = true;
                }else {
                    result = false;
                }
                break;
            }
        }
       return result;
    }
}
