package com.improve10x.tdd.vani.movezerostoend;

import java.util.ArrayList;

public class MoveZerosToEnd {

    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
//            if (numbers.length == 1 && numbers[0] == 0) {
//                return numbers;
//            }
//            if (numbers.length == 2) {
//                if (numbers[0] > numbers[1]) {
//                    return numbers;
//                }
//                int temp = numbers[0];
//                numbers[0] = numbers[1];
//                numbers[1] = temp;
//                return numbers;
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == numbers[1] && numbers[0] > numbers[2]) {
//                    return numbers;
//                }
//                if (numbers[0] == 0) {
//                    int temp = numbers[0];
//                    numbers[0] = numbers[1];
//                    numbers[1] = numbers[2];
//                    numbers[2] = temp;
//                    return numbers;
//                }
//                int temp = numbers[1];
//                numbers[1] = numbers[2];
//                numbers[2] = temp;
//                return numbers;
//            }
//            if (numbers.length == 4) {
//                if (numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[2] > numbers[3]){
//                    return numbers;
//                }
//                if (numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[0] == numbers[3]) {
//                    return numbers;
//                }
//                if (numbers[1] == 0) {
//                    int temp = numbers[1];
//                    numbers[1] = numbers[3];
//                    numbers[3] = temp;
//                    return numbers;
//                }
//                if (numbers[2] == 0) {
//                    int temp = numbers[2];
//                    numbers[2] = numbers[3];
//                    numbers[3] = temp;
//                    return numbers;
//                }
//                int temp = numbers[0];
//                numbers[0] = numbers[3];
//                numbers[3] = temp;
//                return numbers;
//            }
//        }
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != 0) {
                    result.add(numbers[i]);
                }
            }
            for (int i = 0; i < result.size(); i++) {
                numbers[i] = result.get(i);
            }
            for (int i = result.size(); i < numbers.length; i++) {
                numbers[i] = 0;
            }
            return numbers;
        }
        return new int[]{};
    }
}
