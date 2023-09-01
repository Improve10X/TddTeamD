package com.improve10x.tdd.supriya.arrayquestions.leadersinarray;

public class LeadersInArray {
    public int[] find(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return new int[]{0};
        }
        if (numbers.length == 1){
            return new int[]{numbers[0]};
        }
        if (numbers.length == 2){
            if (numbers[1] > numbers[0]){
                return new int[]{numbers[1]};
            }
            return numbers;
        }
        if (numbers.length == 3){
            if (numbers[1] > numbers[0] && numbers[2] > numbers[0]){
                return new int[]{numbers[2]};
            }
           return numbers;
        }
        return new int[]{0};
    }
}
