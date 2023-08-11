package com.improve10x.tdd.krishna.test1problems;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            int n = numbers.length;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = i; j < n; j++) {
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
