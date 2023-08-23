package com.improve10x.tdd.vani.linearsearch;

public class LinearSearch {

    public int find(int[] numbers, int n) {
        if (numbers != null && numbers.length >= 1) {
            if (numbers[0] == n) {
                return 0;
            }
        }
        return -1;
    }
}
