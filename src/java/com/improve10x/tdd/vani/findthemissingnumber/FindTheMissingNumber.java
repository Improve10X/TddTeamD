package com.improve10x.tdd.vani.findthemissingnumber;

public class FindTheMissingNumber {

    public int missingNumber(int[] numbers) {
        int result = 0;
        if (numbers == null){
            return 0;
        }
        for (int i = 0; i < numbers.length; i++){
            result = i;
        }
        return result;
    }
}
