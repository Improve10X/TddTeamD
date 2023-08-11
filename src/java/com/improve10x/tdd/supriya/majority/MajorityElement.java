package com.improve10x.tdd.supriya.majority;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            int n = numbers.length;
            for (int i = 0; i < numbers.length; i++) {
                int count = 0;
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                if (count > n / 2) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }
}
