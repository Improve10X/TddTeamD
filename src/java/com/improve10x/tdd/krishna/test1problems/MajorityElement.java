package com.improve10x.tdd.krishna.test1problems;

public class MajorityElement {
    public int findMajorityElement(int[] numbers) {
        int n = numbers.length;
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
           if(numbers[i] == 1){
               count++;
           }else if(numbers[i] == 2){
               count++;
           }
           if(n / 2 < count){
               return numbers[i];
           }
        }
        if(n == 1){
            if((n / 2) < 1 && numbers[0] == 1){
                return 1;
            }else if((n / 2) < 2){
                return 2;
            }
        }
        return -1;
    }
}
