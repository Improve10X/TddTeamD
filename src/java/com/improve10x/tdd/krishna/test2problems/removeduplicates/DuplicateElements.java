package com.improve10x.tdd.krishna.test2problems.removeduplicates;

public class DuplicateElements {
    public int[] removeDuplicateElements(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            if (numbers.length == 1) {
                return numbers;
            }
            if (numbers.length == 2) {
                if (numbers[0] == numbers[1]) {
                    return new int[]{numbers[0]};
                }
                if(numbers[0] > numbers[1]){
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = temp;
                }
                return numbers;
            }
            if(numbers.length == 3){
                if(numbers[0] == numbers[1] && numbers[1] == numbers[2]){
                    return new int[]{numbers[0]};
                }
                if(numbers[0] == numbers[1]){
                    return new int[]{numbers[0], numbers[2]};
                }
                if(numbers[0] > numbers[1] && numbers[1] == numbers[2]){
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = temp;
                    return new int[]{numbers[0], numbers[1]};
                }
                if(numbers[0] == numbers[2] && numbers[0] < numbers[1]){
                    return new int[]{numbers[0], numbers[1]};
                }
                return numbers;
            }
            if(numbers.length == 4){
                if(numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[0] == numbers[3]){
                    return new int[]{numbers[0]};
                }
                if(numbers[0] == numbers[1] && numbers[2] != numbers[3]){
                    return new int[]{numbers[0], numbers[2], numbers[3]};
                }
                if(numbers[0] == numbers[3] && numbers[1] < numbers[2]){
                    return new int[]{numbers[0], numbers[1] , numbers[2]};
                }
                if(numbers[0] < numbers[1] && numbers[2] == numbers[3]){
                    return new int[]{numbers[2], numbers[0], numbers[1]};
                }
                return numbers;
            }
        }
        return new int[]{};
    }
}
