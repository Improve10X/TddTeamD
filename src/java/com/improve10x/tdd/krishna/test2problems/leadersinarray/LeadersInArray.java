package com.improve10x.tdd.krishna.test2problems.leadersinarray;

public class LeadersInArray {
    public int[] findLeaders(int[] numbers) {
        if(numbers != null && numbers.length == 1){
            return numbers;
        }
        return new int[]{};
    }
}
