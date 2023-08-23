package com.improve10x.tdd.vani.removeduplicatesfromanarray;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(numbers[0]);
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] != result.get(result.size() - 1)) {
                    result.add(numbers[i]);
                }
            }
            int[] resultArray = new int[result.size()];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = result.get(i);
            }
            return resultArray;
        }
        return new int[]{};
    }
}
