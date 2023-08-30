package com.improve10x.tdd.vani.majorityelement;

public class MajorityElements {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length >= 1) {
//                if (numbers.length == 1) {
//                    return numbers[0];
//                }
//                if (numbers.length == 2) {
//                    if (numbers[0] == numbers[1]) {
//                        return numbers[0];
//                    }
//                }
//                if (numbers.length == 3) {
//                    if (numbers[0] == numbers[1] || numbers[0] == numbers[2]) {
//                        return numbers[0];
//                    }
//                    if (numbers[1] == numbers[2]){
//                        return numbers[1];
//                    }
//                }
//                if (numbers[0] == numbers[1] && numbers[0] == numbers[2]){
//                    return numbers[0];
//                }
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }
                if (count > numbers.length/2){
                    return numbers[i];
                }
            }
        }
        return -1;
    }
}
