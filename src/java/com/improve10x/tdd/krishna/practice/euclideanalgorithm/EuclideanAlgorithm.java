package com.improve10x.tdd.krishna.practice.euclideanalgorithm;

public class EuclideanAlgorithm {
    public int findEuclidean(int num1, int num2) {
        int result = 0;
        if((num1 > 0 && num2 > 0) && num1 >= num2){
            if(num1 % num2 == 0){
                result = num2;
            }else {
                result = num1 % num2;
            }
        }
        return result;
    }
}
