package com.improve10x.tdd.supriya.arrayquestions;

public class AppearsOnce {
    public int find(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
//            if (numbers.length == 1) {
//                return numbers[0];
//                if (numbers[0] == 0) {
//                    return numbers[0];
//                }
//                if (numbers[0] == 1) {
//                    return numbers[0];
//                }
//            }
//            if (numbers.length == 3) {
//                if (numbers[0] == numbers[1]) {
//                    return numbers[2];
//                }
//            }
//            if (numbers.length == 5){
//                if (numbers[0] == numbers[1] && numbers[2] == numbers[3]){
//                    return numbers[4];
//                }
                int result = 0;
                for (int i =0; i < numbers.length; i++){
                    result = result ^ numbers[i];
                }
            return result;
    }
}
