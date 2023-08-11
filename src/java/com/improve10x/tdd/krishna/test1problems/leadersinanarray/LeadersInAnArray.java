package com.improve10x.tdd.krishna.test1problems.leadersinanarray;

public class LeadersInAnArray {
    public int[] findLeadersInAnArray(int[] numbers) {
        int[] leaders = {};
        if(numbers.length > 1){
            for(int i = 0; i < numbers.length - 1; i++){
                for(int j = i + 1; j < numbers.length; j++){
                    if(numbers[i] > numbers[j]){
                        leaders[i] = numbers[i];
                    }
                }
            }
            return new int[]{numbers[1]};
        }
        return new int[] {numbers[0]};
    }
}
