package com.improve10x.tdd.vani.leftrotatethearraybyone;

public class LeftRotate {
    public int[] findLeftRotateByArray(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
            for (int i = 0; i < numbers.length; i++){
                if (numbers[0] == numbers[i]){
                    return new int[] {numbers[0]};
                }
            }
        }
        return new int[] {0};
    }
}
