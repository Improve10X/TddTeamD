package com.improve10x.tdd.supriya.arrayquestions.linearsearch;

public class LinearSearch {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length>1) {
            if (numbers[0] == 0) {
                return numbers[0];
            }
        }
        return -1;
    }
}
