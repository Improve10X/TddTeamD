package com.improve10x.tdd.supriya.arrayquestions.arraysorted;

public class ArraySorted {
    public boolean find(int[] numbers) {
        if (numbers != null && numbers.length >1 ){
            if (numbers[0]>numbers[1]){
                return false;
            }
        }
        return true;
    }
}
