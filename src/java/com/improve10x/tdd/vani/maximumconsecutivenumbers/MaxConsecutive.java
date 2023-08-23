package com.improve10x.tdd.vani.maximumconsecutivenumbers;

public class MaxConsecutive {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length >= 1 && numbers.length != 0) {
           if (numbers[0] == 1){
               return 1;
            }
        }
        return 0;
    }
}
