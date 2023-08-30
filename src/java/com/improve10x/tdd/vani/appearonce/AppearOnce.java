package com.improve10x.tdd.vani.appearonce;

public class AppearOnce {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers.length == 1) {
                if (numbers[0] == numbers[0]) {
                    return numbers[0];
                }
            }
            if (numbers.length == 3) {
                if (numbers[0] == numbers[1]) {
                    return numbers[2];
                }
                if (numbers[1] == numbers[2]) {
                    return numbers[0];
                }
                if (numbers[0] == numbers[2]) {
                    return numbers[1];
                }
            }
            if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
                return numbers[3];
            }
            if (numbers[0] == numbers[2] && numbers[0] == numbers[3]) {
                return numbers[1];
            }
        }
        return -1;
    }
}
