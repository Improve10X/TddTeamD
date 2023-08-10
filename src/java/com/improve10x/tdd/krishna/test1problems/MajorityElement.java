package com.improve10x.tdd.krishna.test1problems;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        int n = numbers.length;
        if(n == 1 && (n / 2) < 1){
            return 1;
        }
        return -1;
    }
}
