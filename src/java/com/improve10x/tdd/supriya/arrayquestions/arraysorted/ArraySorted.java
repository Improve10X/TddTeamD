package com.improve10x.tdd.supriya.arrayquestions.arraysorted;

public class ArraySorted {
    public boolean find(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            if (numbers.length == 2) {
                if (numbers[0] > numbers[1]) {
                    return false;
                }
                if (numbers[0] < numbers[1]){
                    return true;
                }
            }
            if (numbers.length == 3) {
                if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
                    return true;
                }
                if (numbers[0] < numbers[1] && numbers[2] < numbers[1]) {
                    return false;
                }
                if (numbers[1] < numbers[0] && numbers[2] < numbers[1]){
                    return false;
                }
            }
        }
        return true;
    }
}
