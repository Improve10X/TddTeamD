package com.improve10x.tdd.supriya.arrayquestions.linearsearch;

public class LinearSearch {
    public int find(int[] numbers, int n ) {
        if (numbers != null && numbers.length>=1) {
//            if (numbers.length == 2) {
//                if (numbers[1] == n) {
//                    return 1;
//                }
//            }
//            if (numbers.length == 3){
//                if (numbers[0] == n){
//                    return 0;
//                }
//                if (numbers[2] == n){
//                    return 2;
//                }
//            }
//            if (numbers.length == 4){
//                if (numbers[3] == n){
//                    return 3;
//                }
//            }
            for (int i = 0; i <numbers.length; i++){
                if (numbers[i] == n){
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
}
