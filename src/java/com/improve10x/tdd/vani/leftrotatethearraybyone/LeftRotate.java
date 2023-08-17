package com.improve10x.tdd.vani.leftrotatethearraybyone;

public class LeftRotate {
    public int[] findLeftRotateByArray(int[] numbers) {
        if (numbers != null && numbers.length == 1) {
            return new int[]{numbers[0]};
        } else if (numbers != null && numbers.length == 2) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
            return new int[]{numbers[0], numbers[1]};
        }
        return new int[]{};
        }
    }



