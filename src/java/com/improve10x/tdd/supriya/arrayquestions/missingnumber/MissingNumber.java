package com.improve10x.tdd.supriya.arrayquestions.missingnumber;

public class MissingNumber {
    public int find(int[] numbers) {
        int result = -1;
        if (numbers != null&& numbers.length>=1 && numbers[0]!=0 ) {
            for (int i = 0; i < numbers.length; i++ ) {
                if (i + 1 != numbers[i]) {
                    result = i + 1;
                    break;
                } else {
                    result = numbers[i]+1;
                }
            }
            return result;
        }
        return-1;
    }
}


