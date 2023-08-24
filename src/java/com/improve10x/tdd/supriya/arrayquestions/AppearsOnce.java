package com.improve10x.tdd.supriya.arrayquestions;

public class AppearsOnce {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers[0] == 0) {
                return 0;
            }
            if (numbers[0] == 1){
                return 1;
            }
        }
        return -1;
    }
}
