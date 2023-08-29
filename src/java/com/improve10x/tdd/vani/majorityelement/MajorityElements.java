package com.improve10x.tdd.vani.majorityelement;

public class MajorityElements {
    public int find(int[] numbers) {
        if (numbers != null) {
            if (numbers.length > numbers.length / 2) {
                return 0;
            }
        }
        return -1;
    }
}
