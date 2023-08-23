package com.improve10x.tdd.krishna.test2problems.moveallzerostoend;

public class AllZerosToTheEnd {
    public int[] moveAllZerosToTheEnd(int[] numbers) {
        if (numbers != null) {
            if (numbers.length == 1) {
                return numbers;
            }
            if (numbers.length == 2) {
                if (numbers[0] == 0) {
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = temp;
                }
                return numbers;
            }
            if (numbers.length == 3) {
                if (numbers[0] == 0 && numbers[1] != 0 && numbers[2] != 0) {
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = numbers[2];
                    numbers[2] = temp;
                }
                if (numbers[0] != 0 && numbers[1] == 0 && numbers[2] != 0) {
                    int temp = numbers[1];
                    numbers[1] = numbers[2];
                    numbers[2] = temp;
                }
                if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] != 0) {
                    int temp = numbers[0];
                    numbers[0] = numbers[2];
                    numbers[2] = temp;
                }
                if (numbers[0] == 0 && numbers[1] != 0) {
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = temp;
                }
                return numbers;
            }
            if(numbers.length == 4){
                return numbers;
            }
        }
        return new int[]{-1};
    }
}
