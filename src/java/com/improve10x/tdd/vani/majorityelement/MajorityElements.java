package com.improve10x.tdd.vani.majorityelement;

public class MajorityElements {
    public int find(int[] numbers) {
        if (numbers != null) {
                if (numbers.length == 1) {
                    return numbers[0];
                }
            }
        return -1;
    }
}
