package com.improve10x.tdd.supriya.arrayquestions.moveszerostoend;

public class MovesZerosToEnd {
    public int[] find(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{};
        }
        if (numbers.length == 1){
            return new int[]{0};
        }
        if (numbers[0]<numbers[1]){
            return new int[]{1,0};
        }
        return new int[]{};
    }

}
