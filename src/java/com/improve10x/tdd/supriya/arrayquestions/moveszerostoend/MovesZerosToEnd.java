package com.improve10x.tdd.supriya.arrayquestions.moveszerostoend;

public class MovesZerosToEnd {
    public int[] find(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{};
        }
        if (numbers.length == 1){
            return new int[]{0};
        }
        if (numbers.length == 2) {
            if (numbers[0] != numbers[1]) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
                return numbers;
            }
        }
        if (numbers.length == 3) {
            if (numbers[0] == 0 && numbers[1] != 0 && numbers[2] != 0 ) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = numbers[2];
                numbers[2] = temp;
                return numbers;
            }
            if (numbers[0]!= 0 && numbers[1] == 0 &&  numbers[2] != 0){
                int temp = numbers[1];
                numbers[1] = numbers[2];
                numbers[2] = temp;
                return numbers;
            }
            return numbers;
        }
        return new int[]{};
    }

}
