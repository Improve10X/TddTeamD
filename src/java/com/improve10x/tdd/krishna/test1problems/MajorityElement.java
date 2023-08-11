package com.improve10x.tdd.krishna.test1problems;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        if(numbers.length == 1 && numbers[0] != 0){
            return numbers[0];
        }
        return -1;
    }
}
