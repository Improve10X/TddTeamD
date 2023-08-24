package com.improve10x.tdd.vani.movezerostoend;

public class MoveZerosToEnd {

    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers[0] == 0) {
                return new int[]{0};
            }
        }
        return new int[]{};
    }
}
