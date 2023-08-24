package com.improve10x.tdd.krishna.test2problems.moveallzerostoend;

import java.util.ArrayList;

public class AllZerosToTheEnd {
    public int[] moveAllZerosToTheEnd(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{-1};
        }
        ArrayList<Integer> result = new ArrayList<>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if (numbers[i] != 0) {
                result.add(numbers[i]);
            }
        }
        int size = result.size();
        for (int i = 0; i < size; i++) {
            numbers[i] = result.get(i);
        }
        for (int i = size; i < n; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }
}
