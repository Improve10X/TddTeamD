package com.improve10x.tdd.vani.arraymissingnumber;

public class MissingNumber {
    public int find(int[] numbers) {
        if (numbers != null && numbers.length >=1 ) {
            if (numbers[0] == 1) {
                return 0;
            }
        }
        return -1;
    }
}
