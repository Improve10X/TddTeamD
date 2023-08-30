package com.improve10x.tdd.supriya.arrayquestions.leadersinarray;

public class LeadersInArray {
    public int[] find(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return new int[]{0};
        }
        if (numbers.length == 1){
            return new int[]{numbers[0]};
        }
        return new int[]{0};
    }
}
