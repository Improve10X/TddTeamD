package com.improve10x.tdd.supriya.arrayquestions.leftrotatearray;

public class LeftRotateArray {
    public int[] find(int[] numbers) {
        if (numbers != null ) {
            if (numbers.length == 1){
            return new int[]{numbers[0]};}
                if (numbers.length == 2) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
                return new int[]{numbers[0], numbers[1]};
            }
            if (numbers.length == 3) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = numbers[2];
                numbers[2] = temp;
                return new int[]{numbers[0], numbers[1], numbers[2]};
            }
        }
        return new int[]{};
    }
}
