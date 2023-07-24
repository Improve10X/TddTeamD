package com.improve10x.tdd.krishna.practice.eulersphi;

public class EulersPhi {
    public int findDivisors(int number) {
        int divisorsSum = 0;
        if(number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisorsSum++;
                }
            }
        }
        return divisorsSum;
    }
}
