package com.improve10x.tdd.krishna.test2problems.moveallzerostoend;

public class AllZerosToTheEnd {
    public int[] moveAllZerosToTheEnd(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
//            if (numbers.length == 1) {
//                return numbers;
//            }
//            if (numbers.length == 2) {
//                if (numbers[0] == 0) {
//                    int temp = numbers[0];
//                    numbers[0] = numbers[1];
//                    numbers[1] = temp;
//                }
//                return numbers;
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == 0 && numbers[1] != 0 && numbers[2] != 0) {
//                    int temp = numbers[0];
//                    numbers[0] = numbers[1];
//                    numbers[1] = numbers[2];
//                    numbers[2] = temp;
//                }
//                if (numbers[0] != 0 && numbers[1] == 0 && numbers[2] != 0) {
//                    int temp = numbers[1];
//                    numbers[1] = numbers[2];
//                    numbers[2] = temp;
//                }
//                if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] != 0) {
//                    int temp = numbers[0];
//                    numbers[0] = numbers[2];
//                    numbers[2] = temp;
//                }
//                if (numbers[0] == 0 && numbers[1] != 0) {
//                    int temp = numbers[0];
//                    numbers[0] = numbers[1];
//                    numbers[1] = temp;
//                }
//                return numbers;
//            }
//            if(numbers.length == 4){
//                if(numbers[2] == 0){
//                    int temp = numbers[2];
//                    numbers[2] = numbers[3];
//                    numbers[3] = temp;
//                }
//                if (numbers[1] == 0){
//                    int temp = numbers[1];
//                    numbers[1] = numbers[2];
//                    numbers[2] = numbers[3];
//                    numbers[3] = temp;
//                }
//                if (numbers[0] == 0){
//                    int temp = numbers[0];
//                    numbers[0] = numbers[1];
//                    numbers[1] = numbers[2];
//                    numbers[2] = numbers[3];
//                    numbers[3] = temp;
//                }
//                return numbers;
//            }
            for (int i = 0; i < numbers.length - 1; i++){//001 -> 100
                if(numbers[i] == 0){
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            return numbers;
        }
        return new int[]{-1};
    }
}
