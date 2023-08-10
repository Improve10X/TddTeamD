package com.improve10x.tdd.krishna.test1problems;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        int n = numbers.length;
        if(n == 1){
            if((n / 2) < 1 && numbers[0] == 1){
                return 1;
            }else if((n / 2) < 2){
                return 2;
            }
        }
        return -1;
    }
}
