package com.improve10x.tdd.vani.movezerostoend;

public class MoveZerosToEnd {

    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers.length == 1 && numbers[0] == 0) {
                return new int[]{0};
            }
            if (numbers.length == 2) {
                if ( numbers[0] > numbers[1]){
                    return numbers;
                }
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
                return numbers;
            }
        }
        return new int[]{};
    }
}
