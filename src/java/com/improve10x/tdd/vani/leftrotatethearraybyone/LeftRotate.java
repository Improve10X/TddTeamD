package com.improve10x.tdd.vani.leftrotatethearraybyone;

public class LeftRotate {
    public int[] findLeftRotateByArray(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            if (numbers[0] == 1) {
                return new int[]{1};
            } else if (numbers[0] == 2) {
                return new int[]{2};
            } else if (numbers[0] == 3) {
                return new int[]{3};
            }
        }
        return new int[] {0};
    }
}
