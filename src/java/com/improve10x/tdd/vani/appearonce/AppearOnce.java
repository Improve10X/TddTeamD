package com.improve10x.tdd.vani.appearonce;

public class AppearOnce {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length != 0 && numbers.length != 2) {
//   if (numbers.length == 1) {
//                if (numbers[0] == numbers[0]) {
//                    return numbers[0];
//                }
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == numbers[1]) {
//                    return numbers[2];
//                }
//                if (numbers[1] == numbers[2]) {
//                    return numbers[0];
//                }
//                if (numbers[0] == numbers[2]) {
//                    return numbers[1];
//                }
//            }
//            if (numbers.length == 4) {
//                if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
//                    return numbers[3];
//                }
//                if (numbers[0] == numbers[2] && numbers[0] == numbers[3]) {
//                    return numbers[1];
//                }
//            }
            for (int i = 0; i < numbers.length; i++){
                int count = 0;
                for (int j = 0; j < numbers.length; j++){
                    if (numbers[i] == numbers[j]){
                        count++;
                    }
                }
                if (count == 1){
                    return numbers[i];
                }
            }
        }
        return -1;
    }
}
