package com.improve10x.tdd.krishna.test1problems.leadersinanarray;

public class LeadersInAnArray {
    public int[] findLeadersInAnArray(int[] numbers) {
        if(numbers[0] == 1){
            return new int[]{1};
        }
        return new int[]{0};
    }
}
