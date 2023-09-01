package com.improve10x.tdd.krishna.test2problems.leadersinarray;

public class LeadersInArray {
    public int[] findLeaders(int[] numbers) {
        if(numbers != null && numbers.length == 1){
            return numbers;
        }
        if(numbers != null && numbers.length == 2){
            if(numbers[0] < numbers[1]){
                return new int[]{numbers[1]};
            }
            return numbers;
        }
        if (numbers != null && numbers.length == 3){
            if(numbers[0] < numbers[2] && numbers[1] < numbers[2]){
                return new int[]{numbers[2]};
            }
            if(numbers[0] < numbers[1] && numbers[2] < numbers[1]){
                return new int[]{numbers[1]};
            }
            if(numbers[1] < numbers[0] && numbers[2] < numbers[0]){
                return new int[]{numbers[0]};
            }
        }
        if(numbers != null && numbers.length == 4){
            if(numbers[0] < numbers[3] && numbers[1] < numbers[3] && numbers[2] < numbers[3]){
                return new int[]{numbers[3]};
            }
            if(numbers[0] < numbers[2] && numbers[1] < numbers[2] && numbers[3] < numbers[2]){
                return new int[]{numbers[2]};
            }
            if(numbers[0] < numbers[1] && numbers[2] < numbers[1] && numbers[3] < numbers[1]){
                return new int[]{numbers[1]};
            }
        }
        return new int[]{};
    }
}
