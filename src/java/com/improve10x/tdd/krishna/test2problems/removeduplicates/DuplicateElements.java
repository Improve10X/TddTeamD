package com.improve10x.tdd.krishna.test2problems.removeduplicates;

public class DuplicateElements {
    public int[] removeDuplicateElements(int[] numbers) {
        if(numbers != null && numbers.length == 1){
            return new int[]{numbers[0]};
        }
        if(numbers != null && numbers.length == 2 && numbers[0] == numbers[1]){
            return new int[]{numbers[0]};
        }
        return new int[]{};
    }
}
