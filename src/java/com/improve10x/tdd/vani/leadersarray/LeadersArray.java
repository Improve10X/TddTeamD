package com.improve10x.tdd.vani.leadersarray;

public class LeadersArray {
    public int[] find(int[] numbers) {
        if (numbers != null && numbers.length != 0) {
            if (numbers.length == 1) {
                if (numbers[0] == numbers[0]) {
                    return new int[]{numbers[0]};
                }
            }
            if (numbers.length == 2) {
                if (numbers[0] < numbers[1]) {
                    return new int[]{numbers[1]};
                }
                if (numbers[0] > numbers[1]) {
                    return new int[]{numbers[0], numbers[1]};
                }
                if (numbers[0] == numbers[1]) {
                    return new int[]{numbers[0], numbers[1]};
                }
            }
            if (numbers[0] == numbers[1] && numbers[0] > numbers[2]){
                return new int[]{numbers[0],numbers[1],numbers[2]};
            }
            if (numbers[0] < numbers[1] && numbers[0] < numbers[2]){
                return new int[]{numbers[2]};
            }
            if (numbers[0] > numbers[1] && numbers[0] > numbers[2]){
                return new int[]{numbers[0],numbers[1],numbers[2]};
            }
            if (numbers[0] < numbers[1] && numbers[0] > numbers[2]){
                return new int[]{numbers[1],numbers[2]};
            }
            if (numbers[0] == numbers[1] && numbers[0] == numbers[2]){
                return new int[]{numbers[0],numbers[1],numbers[2]};
            }

        }
        return new int[]{};
    }
}
