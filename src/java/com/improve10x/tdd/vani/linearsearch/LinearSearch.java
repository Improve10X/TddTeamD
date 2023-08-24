package com.improve10x.tdd.vani.linearsearch;

public class LinearSearch {

    public int find(int[] numbers, int n) {
        if (numbers != null && numbers.length >= 1) {
//            if (numbers.length == 1 && numbers[0] != n){
//                return -1;
//            }
//            if (numbers[0] == n) {
//                return 0;
//            }
//            if (numbers[1] == n){
//                return 1;
//            }
//            if (numbers[2] == n){
//                return 2;
//            }
            int index = -1;
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] == n){
                   index = i;
                }
            }
            return index;
        }
        return -1;
    }
}
